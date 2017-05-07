package com.heasy.spring4.ch1.aop;

import java.lang.annotation.*;

/**
 * Created by heasy on 2017/5/6.
 * 自定义注解，编写拦截规则
 */
@Target(ElementType.METHOD)//注解的作用目标 方法
@Retention(RetentionPolicy.RUNTIME)//注解的保留位置　　注解会在class字节码文件中存在，在运行时可以通过反射获取到
@Documented //说明该注解将被包含在javadoc中
public @interface Action {
    String name();
}
