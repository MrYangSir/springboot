package com.heasy.highlight_spring4.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by heasy on 2017/5/6.
 * 运行类
 */
public class Main {
    public static void main(String[] args) {
//        获取配置文件类，并且创建容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class
        );
//        通过容器获取需要的bean
        UserFunService userFunService = context.getBean(UserFunService.class);
//        调用方法
        String sayHello = userFunService.SayHello("di");
        System.out.println(sayHello);
        context.close();
    }
}
