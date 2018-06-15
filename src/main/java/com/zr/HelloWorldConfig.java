package com.zr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
    带有@Configuration的注解类表示这个类可以使用Spring IoC容器作为bean定义的来源。
    @Bean注解告诉Spring，一个带有@Bean的注解方法将返回一个对象，该对象应该被注册为在Spring应用程序上下文中的bean。
    @Bean(initMethod = "init", destroyMethod = "cleanup" )设置回调函数。
*/
@Configuration
public class HelloWorldConfig {
    @Bean
    public AnnoHelloWorld helloWorld() {
        return new AnnoHelloWorld();
    }
}