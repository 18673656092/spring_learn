package com.zr;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
    public static void main(String[] args) {
          /*ApplicationContext是spring中较高级的容器。和BeanFactory类似，它可以加载配置文
          件中定义的bean，将所有的bean集中在一起，当有请求的时候分配bean。另外，它增加了企业所
          需要的功能，比如，从属性文件中解析文本信息和将事件传递给所指定的监听器。这个容器在 org
          .springframework.context.ApplicationContext interface 接口中定义。ApplicationC
          ontext 包含 BeanFactory 所有的功能，一般情况下，相对于 BeanFactory，ApplicationCo
          ntext 会更加优秀。当然，BeanFactory 仍可以在轻量级应用中使用，比如移动设备或者基于 ap
          plet 的应用程序。
          最常被使用的 ApplicationContext 接口实现：
          FileSystemXmlApplicationContext：该容器从XML文件中加载已被定义的bean。在这里，你需要提供给构造器XML文件的完整路径。
          ClassPathXmlApplicationContext：该容器从XML文件中加载已被定义的bean。在这里，你不需要提供XML文件的完整路径，只需正确配置 CLASSPATH 环境变量即可，因为，容器会从 CLASSPATH 中搜索 bean 配置文件。
          WebXmlApplicationContext：该容器会在一个web应用程序的范围内加载在XML文件中已被定义的bean*/
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
          /*利用XmlBeanFactory(实现了BeanFactory接口)从XML读取元数据，生成一个配置化的应用或系统
          第一步利用框架提供的 XmlBeanFactory()API去生成工厂bean以及利用ClassPathResource() API
          去加载在路径CLASSPATH下可用的bean配置文件。XmlBeanFactory() API 负责创建并初始化所有的对
          象，即在配置文件中提到的bean。
          第二步利用第一步生成的bean工厂对象的getBean()方法得到所需要的 bean。这个方法通过配置文件中
          的bean ID返回一个真正的对象，该对象最后可以用于实际的对象。一旦得到这个对象，就可以利用这个
          对象来调用任何方法。*/
//        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        HelloIndia helloIndia = (HelloIndia) context.getBean("helloIndia");
//        HelloWorld obj2 = (HelloWorld) factory.getBean("helloWorld");
        obj.getMessage();
        helloIndia.getiMessage();
        helloIndia.getMessage();
//        obj2.getMessage();
//        ((ClassPathXmlApplicationContext) context).registerShutdownHook();

//        Student student = (Student) context.getBean("student");
//        System.out.println("Name : " + student.getName() );
//        System.out.println("Age : " + student.getAge() );
//        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
//        textEditor.spellCheck();
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
//        AnnoHelloWorld annoHelloWorld = ctx.getBean(AnnoHelloWorld.class);
//        annoHelloWorld.setMessage("Hello World!");
//        annoHelloWorld.getMessage();
        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
        student.printThrowException();
    }
}