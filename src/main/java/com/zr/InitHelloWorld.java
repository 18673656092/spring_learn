package com.zr;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/*
Spring Bean 后置处理器
BeanPostProcessor接口定义回调方法，你可以实现该方法来提供自己的实例化逻辑，依赖解析逻辑等。你也可以在Spring容器通过插入一个或多个BeanPostProcessor
的实现来完成实例化，配置和初始化一个bean之后实现一些自定义逻辑回调方法。
你可以配置多个BeanPostProcessor接口，通过设置BeanPostProcessor实现的Ordered接口提供的order属性来控制这些BeanPostProcessor接口的执行顺序。
BeanPostProcessor可以对bean(或对象）实例进行操作，这意味着 Spring IoC 容器实例化一个bean实例，然后BeanPostProcessor接口进行它们的工作。
ApplicationContext会自动检测由BeanPostProcessor接口的实现定义的 bean，注册这些bean为后置处理器，然后通过在容器中创建bean，在适当的时候调用它。
*/
public class InitHelloWorld implements BeanPostProcessor {
   public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//      HelloWorld helloWorld = (HelloWorld) bean;
//      ((HelloWorld) bean).setMessage("Hello Java!");
      System.out.println("BeforeInitialization : " + beanName);
      return bean;  // you can return any other object as well
   }
   public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//      HelloWorld helloWorld = (HelloWorld) bean;
//      ((HelloWorld) bean).setMessage("Hello Scala!");
      System.out.println("AfterInitialization : " + beanName);
      return bean;  // you can return any other object as well
   }
}