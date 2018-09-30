package com.aop.advice.introduction;

import com.aop.ForumService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhuran on 2018/9/30 0030
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("com/aop/advice/introduction/config.xml");
        ForumService forumService = (ForumService) app.getBean("server");
        Monitorable monitorable = (Monitorable) forumService;
        monitorable.setMonitorActive(true);
        forumService.removeForum(100);
    }
}
