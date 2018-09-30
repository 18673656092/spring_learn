package com.aop.advice.introduction;

import com.aop.PerformanceMonitor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * Created by zhuran on 2018/9/30 0030
 */
public class MonitorPerformance extends DelegatingIntroductionInterceptor implements Monitorable {

    private ThreadLocal<Boolean> MonitorStatus = new ThreadLocal<>();

    @Override
    public void setMonitorActive(boolean active) {
        MonitorStatus.set(active);
    }

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        Object obj = null;
        if(MonitorStatus.get()!=null && MonitorStatus.get()){
            PerformanceMonitor.start(mi.getClass().getName() + "." + mi.getMethod().getName());
            obj = super.invoke(mi);
            PerformanceMonitor.end();
        }else {
            obj = super.invoke(mi);
        }
        return obj;
    }
}
