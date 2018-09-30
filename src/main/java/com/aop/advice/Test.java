package com.aop.advice;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhuran on 2018/9/30 0030
 */
public class Test {
    public static void main(String[] args) {
//        Waiter target = new NaiveWaiter();
//        BeforeAdvice advice = new GreetingBeforeAdvice();
//        AfterReturningAdvice afterReturningAdvice = new GreetingAfterAdvice();
//        ProxyFactory pf = new ProxyFactory();
//        pf.setTarget(target);
//        pf.setInterfaces(target.getClass().getInterfaces());
//        pf.addAdvice(advice);
//        pf.addAdvice(afterReturningAdvice);
//        Waiter proxy = (Waiter) pf.getProxy();
//        proxy.greetTo("John");
//        proxy.serveTo("Tom");
        ApplicationContext app = new ClassPathXmlApplicationContext("com/aop/advice/config.xml");
        Waiter waiter = (Waiter) app.getBean("waiter");
        waiter.greetTo("Tom");
    }
}
