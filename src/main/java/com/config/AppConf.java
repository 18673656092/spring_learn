package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhuran on 2018/9/29 0029
 */
@Configuration
public class AppConf {
    @Bean
    public UserDao userDao(){
        return new UserDao();
    }
    @Bean
    public LoginDao loginDao(){
        return new LoginDao();
    }
    @Bean
    public LoginServer loginServer(){
        LoginServer loginServer = new LoginServer();
        loginServer.setLoginDao(loginDao());
        loginServer.setUserDao(userDao());
        return loginServer;
    }
}
