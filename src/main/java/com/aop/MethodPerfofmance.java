package com.aop;

/**
 * Created by zhuran on 2018/9/30 0030
 */
public class MethodPerfofmance {
    private long start;
    private long end;
    private String serviceMethod;
    public MethodPerfofmance(String serviceMethod){
        this.serviceMethod = serviceMethod;
        this.start = System.currentTimeMillis();
    }
    public void printPerformance(){
        end = System.currentTimeMillis();
        System.out.println("serviceMethod花费时间: " + (end - start));
    }
}
