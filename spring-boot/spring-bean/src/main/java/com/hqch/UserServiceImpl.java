package com.hqch;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.LifecycleProcessor;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author huqichao
 * @date 2018-05-28 10:15
 */
@Service
public class UserServiceImpl implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, LifecycleProcessor {

    private boolean isRunning;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.getClass().getName() + "-------afterPropertiesSet");
    }

    public UserServiceImpl(){
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
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(this.getClass().getName() + "-------setBeanName");
    }

    public void sayHello(){
        System.out.println("---------hello");
    }

    @Override
    public void onRefresh() {
        System.out.println(this.getClass().getName() + "-------onRefresh");
    }

    @Override
    public void onClose() {
        System.out.println(this.getClass().getName() + "-------onClose");
    }

    @Override
    public void start() {
        isRunning = true;
        System.out.println(this.getClass().getName() + "-------start");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().getName() + "-------stop");
        isRunning = false;
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }
}
