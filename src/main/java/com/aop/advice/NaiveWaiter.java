package com.aop.advice;

/**
 * Created by zhuran on 2018/9/30 0030
 */
public class NaiveWaiter implements Waiter{

    @Override
    public void greetTo(String s) {
        System.out.println("greet to " + s);
    }

    @Override
    public void serveTo(String s) {
        System.out.println("serve to " + s);
    }
}
