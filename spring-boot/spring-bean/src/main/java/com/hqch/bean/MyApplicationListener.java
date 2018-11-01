package com.hqch.bean;

import com.hqch.UserServiceImpl;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.*;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * spring加载完成
 * @author huqichao
 * @date 2018-05-28 11:50
 */
@Configuration
public class MyApplicationListener implements ApplicationListener<ApplicationContextEvent> {
    @Override
    public void onApplicationEvent(ApplicationContextEvent event) {
        if (event instanceof ContextRefreshedEvent){
            System.out.println(this.getClass().getName() + "-------onApplicationEvent-------ContextRefreshedEvent");

            AbstractApplicationContext ac = (AbstractApplicationContext) event.getApplicationContext();
            ac.start();

            ac.stop();
        }
        if (event instanceof ContextStartedEvent){
            System.out.println(this.getClass().getName() + "-------onApplicationEvent-------ContextStartedEvent");
        }
        if (event instanceof ContextStoppedEvent){
            System.out.println(this.getClass().getName() + "-------onApplicationEvent-------ContextStoppedEvent");
            AbstractApplicationContext ac = (AbstractApplicationContext) event.getApplicationContext();
            UserServiceImpl userService = ac.getBean(UserServiceImpl.class);
            userService.sayHello();
        }
        if (event instanceof ContextClosedEvent){
            System.out.println(this.getClass().getName() + "-------onApplicationEvent-------ContextClosedEvent");
        }
    }
}
