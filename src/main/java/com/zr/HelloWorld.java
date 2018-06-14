package com.zr;

public class HelloWorld {
   private String message;
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