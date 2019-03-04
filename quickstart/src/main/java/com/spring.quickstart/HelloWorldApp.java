package com.spring.quickstart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldApp {
    public static void main(String[] args) {
//        读入xml文件
        ApplicationContext Context=new ClassPathXmlApplicationContext("/beans.xml");
//        读取配置好的bean
        HelloWorld helloworld =(HelloWorld) Context.getBean("helloworld");
//        运行helloworld的方法
        System.out.println(helloworld.getHello());


    }
}
