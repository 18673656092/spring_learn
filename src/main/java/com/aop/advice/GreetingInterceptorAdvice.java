package com.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by zhuran on 2018/9/30 0030
 */
public class GreetingInterceptorAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        String clentName = (String) methodInvocation.getArguments()[0];
        System.out.println("How Are You " + clentName);
        Object obj = methodInvocation.proceed();
        System.out.println("Please");
        return obj;
    }
}
