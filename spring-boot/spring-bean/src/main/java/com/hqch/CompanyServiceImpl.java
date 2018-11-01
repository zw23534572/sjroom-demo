package com.hqch;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author huqichao
 * @date 2018-05-28 10:15
 */
@Service
public class CompanyServiceImpl implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.getClass().getName() + "-------afterPropertiesSet");
    }

    public CompanyServiceImpl(){
        System.out.println(this.getClass().getName() + "-------构造函数");
    }

    @PostConstruct
    public void init(){
        System.out.println(this.getClass().getName() + "-------init");
    }

    @PreDestroy
    public void preDestory(){
        System.out.println(this.getClass().getName() + "-------preDestory");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(this.getClass().getName() + "-------destroy");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(this.getClass().getName() + "-------setBeanFactory:" + beanFactory.getClass().getName());
        UserServiceImpl userService =  beanFactory.getBean(UserServiceImpl.class);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(this.getClass().getName() + "-------setBeanName");
    }
}
