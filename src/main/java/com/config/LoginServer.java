package com.config;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhuran on 2018/9/29 0029
 */
@Service
public class LoginServer {
    @Resource
    private LoginDao loginDao;
    @Resource
    private UserDao userDao;

    public LoginDao getLoginDao() {
        return loginDao;
    }

    public void setLoginDao(LoginDao loginDao) {
        this.loginDao = loginDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
