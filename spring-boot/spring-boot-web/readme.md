##简介
本章为初始章节
介绍spring boot 怎么启动

###配置pom.xml
引用spring boot 的父类文件
```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>1.5.6.RELEASE</version>
</parent>
```
配置spring boot web start
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
</dependencies>

```
配置完成，开始启动
StartupServer.main就ok
spring boot 的启动是以jar包形式，jar包里面包含web组件，所以启动十分的方便

>注意StartupServer必须放在包下，不能直接放在根目录.
```xml
   ** WARNING ** : Your ApplicationContext is unlikely to start due to a @ComponentScan of the default package.
```