package com.heasy.spring4.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by heasy on 2017/5/7.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingleService demoSingleService1 = context.getBean(DemoSingleService.class);
        DemoSingleService demoSingleService2 = context.getBean(DemoSingleService.class);

        System.out.println("单例："+demoSingleService1.equals(demoSingleService2));

        DemoPrototypeService demoPrototypeService1= context.getBean(DemoPrototypeService.class);
        DemoPrototypeService demoPrototypeService2= context.getBean(DemoPrototypeService.class);

        System.out.println("多例："+demoPrototypeService1.equals(demoPrototypeService2));

    }
}
