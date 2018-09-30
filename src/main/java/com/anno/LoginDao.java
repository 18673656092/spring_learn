package com.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by zhuran on 2018/9/28 0028
 */
@Repository
public class LoginDao {

    public void loginDao(LoginDo loginDo){
        System.out.println("loginDao: " + loginDo.getName() + " " + loginDo.getPassword());
    }

}
