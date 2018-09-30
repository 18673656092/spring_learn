package com.aop.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by zhuran on 2018/9/30 0030
 */
public class GreetingAfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
//        System.out.println(o.getClass().getName());
//        System.out.println(method.getName());
//        System.out.println(Arrays.toString(objects));
//        System.out.println(o1.getClass().getName());
        System.out.println("Please");
    }
}
