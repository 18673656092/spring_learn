//package com.spring;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
///**
// * Created by zhuran on 2018/9/27 0027
// */
//@Configuration
//public class Beans {
//    @Bean(name = "car")
//    public Car buildCar(){
//        Car car = new Car();
//        car.setBrand("红旗");
//        car.setColor("红色");
//        return car;
//    }
//
//    public static void main(String[] args) {
//        ApplicationContext app = new AnnotationConfigApplicationContext(Beans.class);
//        Car car = (Car) app.getBean("car");
//        System.out.println(car.getBrand());
//    }
//}
