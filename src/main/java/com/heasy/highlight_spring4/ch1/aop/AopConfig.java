package com.heasy.highlight_spring4.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by heasy on 2017/5/6.
 * 配置类
 */
@Configuration//声明这是一个配置文件
@ComponentScan("com.heasy.highlight_spring4.ch1.aop")//扫描所有的注解
@EnableAspectJAutoProxy //开启spring对aspectJ的支持
public class AopConfig {
}
