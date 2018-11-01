# build 该容器
docker build -t registry.cn-shenzhen.aliyuncs.com/sjroom/spring-boot-web .
#运行该docker容器
docker run --name spring-boot-web -d registry.cn-shenzhen.aliyuncs.com/sjroom/spring-boot-web