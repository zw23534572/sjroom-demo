package com.hqch.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;

/**
 * spring初始化每个bean
 * @author huqichao
 * @date 2018-05-28 10:19
 */
@Configuration
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass().getName().startsWith("com.hqch")){
            System.out.println(this.getClass().getName() + "-------" + beanName + "-------postProcessBeforeInitialization");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass().getName().startsWith("com.hqch")){
            System.out.println(this.getClass().getName() + "-------" + beanName + "-------postProcessAfterInitialization");
        }
        return bean;
    }
}
