# 简介

spring boot 使用mybatis 的实例介绍。

最简单的例子，其中在测试中还包括用h2的数据库进行模拟测试，如果没有本地没有安装数据库的童鞋

同样可以测试。

## 异常

### 异常1: No qualifying bean of type 'spring.boot.jdbc.mybatis.dao.UserMapper'

原因：UserMapper没有加载到spring容器

解决办法

1. @Mapper 加在没有interface 的Mapper.java文件上
```java
import org.apache.ibatis.annotations.Mapper;
import User;
import java.util.List;
/**
  * @Mapper加载
*/
@Mapper
public interface UserMapper {
    List<User> selectAll();
}
```

2. 项目启动的时候，加入@MapperScan("spring.boot.jdbc.mybatis.dao*")
```java
@SpringBootApplication
@MapperScan("spring.boot.jdbc.mybatis.dao*")
public class StartupServer {
    public static void main(String[] args) {
        SpringApplication.run(StartupServer.class, args);
    }
}
```

### 异常问题2：spring容器的异常
1. 错误配置
```java
@MapperScan(sspring.boot.jdbc.mybatis.dao
2. 正确配置
```java
@MapperScan("spring.bspring.boot.jdbc.mybatis.dao
## 疑问：
```xml
mybatis.typeAliasesPackage=spring.boot.jdbc.mybatis.entity.entity
```
不加也能正常使用，不知道这句到底有啥用？