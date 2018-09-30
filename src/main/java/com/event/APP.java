package com.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhuran on 2018/9/29 0029
 */
public class APP {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        MailSender mailSender = (MailSender) applicationContext.getBean("mailSender");
        mailSender.sendMail("zhuran@flashhold.com");
    }
}
