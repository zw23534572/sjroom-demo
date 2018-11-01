package spring.boot.jdbc.mybatis.mvc.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan("spring.boot.jdbc.mybatis.dao*")
@ImportResource(locations={"classpath:application-bean.xml"})
public class DaoApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(DaoApplication.class, args);
    }
}
