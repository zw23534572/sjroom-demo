package com.hqch.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

/**
 * 所有bean加载完成
 * @author huqichao
 * @date 2018-05-28 11:56
 */
@Configuration
public class MyApplicationContextAware implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(this.getClass().getName() + "-------setApplicationContext");
    }
}
