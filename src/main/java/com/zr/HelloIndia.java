package com.zr;

/**
 * Created by zhuran on 2018/6/14 0014
 */
public class HelloIndia {
    private String message;
    private String iMessage;

    public void getiMessage() {
        System.out.println("Your iMessage : " + iMessage);
    }

    public void setiMessage(String iMessage) {
        this.iMessage = iMessage;
    }

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }

    private void init() {
        System.out.println("before");
    }

    private void destroy() {
        System.out.println("end");
    }
}
