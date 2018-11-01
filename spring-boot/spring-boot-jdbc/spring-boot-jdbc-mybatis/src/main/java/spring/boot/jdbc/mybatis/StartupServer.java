package spring.boot.jdbc.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("spring.boot.jdbc.mybatis.dao*")
public class StartupServer {
    public static void main(String[] args) {
        SpringApplication.run(StartupServer.class, args);
    }
}
