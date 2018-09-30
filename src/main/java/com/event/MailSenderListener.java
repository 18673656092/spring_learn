package com.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by zhuran on 2018/9/29 0029
 */
@Component
public class MailSenderListener implements ApplicationListener<MailSendEvent> {
    @Override
    public void onApplicationEvent(MailSendEvent event) {
        MailSendEvent mse = event;
        System.out.println("MailSenderListener:向" + mse.getTo() + "发送邮件");
    }
}
