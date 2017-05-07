package com.heasy.spring4.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Created by heasy on 2017/5/7.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();//创建容器
        ConfigurableEnvironment environment = context.getEnvironment();
//        environment.setActiveProfiles("dev");//激活profile为dev
        environment.setActiveProfiles("prod");//激活profile为prod
        context.register(ProfileConfig.class);//注册bean配置
        context.refresh();//刷新容器

        DemoBean demoBean = context.getBean(DemoBean.class);
        String content = demoBean.getContent();
        System.out.println(content);
        context.close();
    }
}
