package com.hqch.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Configuration;

/**
 * spring初始化BeanFactory,修改bean的定义属性
 * @author huqichao
 * @date 2018-05-28 10:13
 */
@Configuration
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    /**
     * Modify the application context's internal bean factory after its standard
     * initialization. All bean definitions will have been loaded, but no beans
     * will have been instantiated yet. This allows for overriding or adding
     * properties even to eager-initializing beans.
     *
     * @param beanFactory the bean factory used by the application context
     * @throws BeansException in case of errors
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println(this.getClass().getName() + "-------postProcessBeanFactory");
        BeanDefinition definition1 = beanFactory.getBeanDefinition("userServiceImpl");
        BeanDefinition definition2 = beanFactory.getBeanDefinition("companyServiceImpl");
//        definition2.setDependsOn("userServiceImpl");
        System.out.println(this.getClass().getName() + "------" + definition1.getBeanClassName());
    }
}
