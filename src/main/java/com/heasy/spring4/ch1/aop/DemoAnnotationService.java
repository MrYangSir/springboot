package com.heasy.spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by heasy on 2017/5/6.
 * 编写使用注解进行类拦截
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解试拦截类的add的操作")
    public void add() {
    }
}
