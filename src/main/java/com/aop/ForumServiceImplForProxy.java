package com.aop;

/**
 * Created by zhuran on 2018/9/30 0030
 */
public class ForumServiceImplForProxy implements ForumService{
    @Override
    public void removeTopic(int ID) {
        System.out.println("模拟Topic操作 " + ID);
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removeForum(int ID) {
        System.out.println("模拟Forum操作 " + ID);
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
