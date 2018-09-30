package com.anno;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by zhuran on 2018/9/28 0028
 */
@Component
public class LoginDo {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @PostConstruct
    public void set(){
        this.name = "zhuran";
        this.password = "123456";
    }
}
