package com.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

/**
 * Created by zhuran on 2018/9/28 0028
 */
public class LoginApp {

    public void login(){
        ApplicationContext app = new ClassPathXmlApplicationContext("application.xml");
        LoginDo loginDo = (LoginDo) app.getBean("loginDo");
        LoginController loginController = (LoginController) app.getBean("loginController");
        loginController.login(loginDo);
    }
}
