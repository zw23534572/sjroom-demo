package com.idgenerate;

import com.idgenerate.common.IPUtil;
import com.idgenerate.service.IDGenerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PreDestroy;
import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
public class StartupServer {

    @Autowired
    IDGenerateService idGenerateService;

    public static void main(String[] args) {
        SpringApplication.run(StartupServer.class, args);
    }

    /**
     * todo 容器消费时，调用此方法
     */
    @PreDestroy
    public void shutdown() {
        idGenerateService.replaceCurrentMaxId(IPUtil.getLocalIp());
    }
}
