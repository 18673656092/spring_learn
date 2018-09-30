package com.aop;

/**
 * Created by zhuran on 2018/9/30 0030
 */
public class PerformanceMonitor {
    private static ThreadLocal<MethodPerfofmance> perfofmanceThreadLocal = new ThreadLocal<MethodPerfofmance>();

    public static void start(String method){
        System.out.println("Begin monitor...");
        MethodPerfofmance methodPerfofmance = new MethodPerfofmance(method);
        perfofmanceThreadLocal.set(methodPerfofmance);
    }

    public static void end(){
        System.out.println("End monitor...");
        MethodPerfofmance methodPerfofmance = perfofmanceThreadLocal.get();
        methodPerfofmance.printPerformance();
    }
}
