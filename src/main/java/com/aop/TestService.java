package com.aop;

/**
 * Created by zhuran on 2018/9/30 0030
 */
public class TestService {
    public static void main(String[] args) {
//        ForumService forumService = new ForumServiceImpl();
//        forumService.removeTopic(100);
//        forumService.removeForum(400);

//        ForumService target = new ForumServiceImplForJDKDynamicProxy();
//        PerformanceHandler handler = new PerformanceHandler(target);
//        ForumService proxy = (ForumService) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),handler);
//        System.out.println(target.getClass().getClassLoader());
//        System.out.println(Arrays.toString(target.getClass().getInterfaces()));
//        System.out.println(target.getClass().getName());
//        System.out.println(Arrays.toString(target.getClass().getDeclaredMethods()));
//        proxy.removeTopic(100);
//        proxy.removeForum(400);

         CglibProxy cglibProxy = new CglibProxy();
         ForumServiceImplForProxy forumServiceImplForProxy = (ForumServiceImplForProxy) cglibProxy.getProxy(ForumServiceImplForProxy.class);
         forumServiceImplForProxy.removeForum(100);
         forumServiceImplForProxy.removeTopic(400);

    }
}
