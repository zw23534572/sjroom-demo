 #!/usr/bin/env bash

  #=========================每个项目需要修改部分=============
  #项目路径
  JAR_PATH="/export/App/spring-boot-web";
  #每个项目路径下xxxxx.jar的名称
  JAR_NAME="spring-boot-web";
  #=========================每个项目需要修改部分=============

  #当前这个应用启动端口号
  PORT=80;
  #停止应用检测间隔时间(秒)
  SLEEP_TIME=5;


  #disconf上的环境(env不用在镜像里配置，已经统一配置)
  ENV="$env";

  #系统中java和jps命令路径
  JAVA="/export/servers/jdk/bin/java";
  JPS="/export/servers/jdk/bin/jps";


  if [ "$USER" == "root" ]; then
      echo "不能使用root用户启动";
      exit 1;
  fi

  function pid(){
      echo `$JPS | grep $JAR_NAME | awk '{print $1}'`;
  }

  function service_start(){
      $JAVA -jar "$JAR_PATH/$JAR_NAME.jar" > /dev/null 2>./error.log &
  }

  function service_stop(){
      pid=`pid`;
      if [ -n "$pid" ]; then
          echo "$JAR_NAME is Killing($pid)";
          #通过springboot提供http接口停止应用
          http_code=`curl -X POST -o /dev/null -s -w %{http_code} 127.0.0.1:$PORT/shutdown`;
          sleep $SLEEP_TIME;
          pid=`pid`;
          #如果springboot提供http接口没有停止应用，则kill进程id
          if [ -n "$pid" ]; then
              kill $pid;
          fi
          sleep $SLEEP_TIME;
          pid=`pid`;
          #如果kill进程id不成功，则kill -9
          if [ -n "$pid" ]; then
              kill -9 $pid;
          fi
      else
          echo "$JAR_NAME was not Running";
      fi
  }


  case $1 in
      "start")
          pid=`pid`;
          if [ -n "$pid" ];then
              echo "$JAR_NAME is already Started";
              exit 1;
          fi
          service_start;
          pid=`pid`;
          if [ -z "$pid" ];then
              echo "$JAR_NAME start Fail!";
              exit 1;
          else
              echo "$JAR_NAME is Started!";
              exit 0;
          fi
          ;;
      "stop")
          service_stop;
          pid=`pid`;
          if [ -n "$pid" ];then
              echo "$JAR_NAME stop Fail!";
              exit 1;
          else
              echo "$JAR_NAME is Stoped!";
              exit 0;
          fi
          ;;
      "restart")
          service_stop;
          pid=`pid`;
          if [ -n "$pid" ];then
              echo "$JAR_NAME stop Fail!";
              exit 1;
          else
              echo "$JAR_NAME is Stoped!";
          fi
          service_start;
          pid=`pid`;
          if [ -z "$pid" ];then
              echo "$JAR_NAME start Fail!";
              exit 1;
          else
              echo "$JAR_NAME is Started!";
              exit 0;
          fi
          ;;
  esac
