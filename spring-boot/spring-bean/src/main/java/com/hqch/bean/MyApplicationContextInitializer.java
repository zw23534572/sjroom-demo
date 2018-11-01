package com.hqch.bean;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * spring初始化前
 * @author huqichao
 * @date 2018-05-28 11:27
 */
public class MyApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println(this.getClass().getName() + "-------initialize");
//        AbstractApplicationContext ac = (AbstractApplicationContext) applicationContext;
//        ac.start();
//
//        ac.stop();
    }
}
