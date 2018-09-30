package com.spring;

import javafx.application.Application;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;

/**
 * Created by zhuran on 2018/9/27 0027
 */
public class Car implements BeanFactoryAware,BeanNameAware,InitializingBean,DisposableBean {
    private String  brand;
    private String color;
    private Boss boss;

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    public Car(String brand, String color, Boss boss){
        this.brand = brand;
        this.color = color;
        this.boss = boss;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("调用SetBrand()设置属性: " + brand);
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public Car(){
        System.out.println("调用Car的构造函数");
    }

    public void setColor(String color) {
        System.out.println("调用SetColor()设置属性: " + color);
        this.color = color;
    }

    public void print(){
        System.out.println("brand: " + brand + ",color: " + color);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("调用setBeanFactory()");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("调用setBeanName()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("调用afterPropertiesSet()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("调用destroy()");
    }

    public void initMethod(){
        System.out.println("调用initMethod()");
    }

    public void destroyMethod(){
        System.out.println("调用destroyMethod()");
    }

    public static void main(String[] args) throws IOException {
//        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
//        Resource res = resourcePatternResolver.getResource("application.xml");
//        System.out.println(res.getURI());
//        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
//        reader.loadBeanDefinitions(res);
//        defaultListableBeanFactory.addBeanPostProcessor(new MyBeanPostProcessor());
//        defaultListableBeanFactory.addBeanPostProcessor(new MyInstantionAwareBeanPostProcessor());
//        Car carOld = (Car) defaultListableBeanFactory.getBean("car");
//        carOld.print();
        /*------------------------------------------------------------------------------------------*/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        Car car = (Car)applicationContext.getBean("car");
        car.setBrand("大黄蜂");
        Car car1 = (Car)applicationContext.getBean("car");
        car.print();
        car1.print();
    }
}
