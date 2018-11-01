package spring.boot.dubbo.producter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations={"classpath:dubbo.xml"})
public class StartupServer {

    private static Logger logger = LoggerFactory.getLogger(StartupServer.class);

    public static void main(String[] args) {
        logger.info("StartupServer started");
        SpringApplication.run(StartupServer.class, args);
    }
}

