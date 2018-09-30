package com.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhuran on 2018/9/28 0028
 */
@Service
public class LoginServer {

    @Resource
    private  LoginDao loginDao;

    public void login(LoginDo loginDo){
        loginDao.loginDao(loginDo);
    }

}
