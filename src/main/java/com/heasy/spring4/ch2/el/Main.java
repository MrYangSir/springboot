package com.heasy.spring4.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by heasy on 2017/5/7.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ELConfig.class);
        ELConfig elConfig = context.getBean(ELConfig.class);
        elConfig.outputResource();
        context.close();

    }
}
