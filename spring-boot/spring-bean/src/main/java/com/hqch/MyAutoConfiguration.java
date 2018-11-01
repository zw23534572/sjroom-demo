package com.hqch;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author huqichao
 * @date 2018-05-28 14:31
 */
@Component
public class MyAutoConfiguration {

    public MyAutoConfiguration(){
        System.out.println(this.getClass().getName() + "-------构造函数");
    }


}
