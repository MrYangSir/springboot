package com.heasy.spring4.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by heasy on 2017/5/7.
 * 使用JSR250形式的bean
 */
public class JSR250WayService {
    @PostConstruct//在构造函数执行完后执行
    public void init() {
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy//在bean销毁前执行
    public void destroy() {
        System.out.println("jsr250-destory-method");
    }
}
