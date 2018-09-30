package com.aop.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by zhuran on 2018/9/30 0030
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
//        System.out.println(o.getClass().getName());
//        System.out.println(method.getName());
//        System.out.println(Arrays.toString(objects));
        String clentName = (String) objects[0];
        System.out.println("How Are You " + clentName);
    }
}
