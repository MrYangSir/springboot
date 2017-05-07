package com.heasy.spring4.ch1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by heasy on 2017/5/6.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class)
                ;
        UserFunService userFunService = context.getBean(UserFunService.class);
        String sayHello = userFunService.SayHello("java Config");
        System.out.println(sayHello);
        context.close();
    }
}
