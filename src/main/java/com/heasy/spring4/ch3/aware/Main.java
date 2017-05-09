package com.heasy.spring4.ch3.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by heasy on 2017/5/10.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class)
                ;
        AwareService awareService = context.getBean(AwareService.class);
        awareService.outputResult();
        context.close();
    }
}
