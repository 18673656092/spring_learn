package com.zr;

/*
    @Required修饰的属性在bean中没有设置的话会抛出异常BeanInitializationException
*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Student {
    private Integer age;
    private String name;

    /*
        @Autowired注释意味着依赖是必须的，它类似于@Required注释，然而，你可以使用@Autowired的required=false选项关闭默认行为。
    */
//    @Autowired(required = false)
    @Required
    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printThrowException(){
        System.out.println("Exception raised");
        throw new IllegalArgumentException();
    }
}