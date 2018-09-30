package com.aop;

/**
 * Created by zhuran on 2018/9/30 0030
 */
public class ForumServiceImpl implements ForumService{
    @Override
    public void removeTopic(int topicID) {
        PerformanceMonitor.start("com.aop.ForumServiceImpl.removeTopic");
        System.out.println("模拟Topic操作 " + topicID);
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        PerformanceMonitor.end();
    }

    @Override
    public void removeForum(int ForumID) {
        PerformanceMonitor.start("com.aop.ForumServiceImpl.removeForum");
        System.out.println("模拟Forum操作 " + ForumID);
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        PerformanceMonitor.end();
    }
}
