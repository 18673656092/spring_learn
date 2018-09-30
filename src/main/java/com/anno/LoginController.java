package com.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by zhuran on 2018/9/28 0028
 */
@Controller
public class LoginController {
    @Resource
    private LoginServer loginServer;

    public void login(LoginDo loginDo){
        loginServer.login(loginDo);
    }

}
