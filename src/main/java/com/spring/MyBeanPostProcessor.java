package com.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by zhuran on 2018/9/28 0028
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("car")){
            Car car = (Car)bean;
            if(car.getColor().equals("")){
                System.out.println("调用MyBeanPostProcessor.postProcessBeforeInitialization()");
                car.setColor("红色");
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("car")){
            Car car = (Car)bean;
            if(car.getBrand().equals("")){
                System.out.println("调用MyBeanPostProcessor.postProcessAfterInitialization()");
                car.setBrand("宝马");
            }
        }
        return bean;
    }
}
