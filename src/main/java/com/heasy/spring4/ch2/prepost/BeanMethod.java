package com.heasy.spring4.ch2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * Created by heasy on 2017/5/7.
 */
@Service
public class BeanMethod {
    //java配置
    @Bean(initMethod = "init", destroyMethod = "destroy")
//指定beanservice类的init和destory方法在构造后、bean销毁之前执行
    BeanWayService beanWayService() {
        return new BeanWayService();
    }

    //注解配置
    @Bean
    JSR250WayService jsr250WayService() {
        return new JSR250WayService();
    }
}
