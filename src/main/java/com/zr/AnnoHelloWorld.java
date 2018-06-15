package com.zr;

/**
 * Created by zhuran on 2018/6/15 0015
 */
public class AnnoHelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
