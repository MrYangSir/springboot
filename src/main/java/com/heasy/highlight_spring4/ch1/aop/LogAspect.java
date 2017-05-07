package com.heasy.highlight_spring4.ch1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by heasy on 2017/5/6.
 * 编写切面类
 */
@Aspect//声明一个切面
@Component//让切面成为spring容器管理的bean
public class LogAspect {
    @Pointcut("@annotation(com.heasy.highlight_spring4.ch1.aop.Action)")//声明切点
    public void annotationPointCut() {
    }

    @After("annotationPointCut()")//声明一个建言
    public void after(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解拦截：" + action.name());//通过反射获取注解上的树形，做下日志记录

    }

    @Before("execution(* com.heasy.highlight_spring4.ch1.aop.DemoMethonService.*(..))")//声明一个建言，直接使用拦截器规则
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法拦截：" + method.getName());
    }

}
