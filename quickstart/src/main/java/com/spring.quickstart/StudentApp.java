package com.spring.quickstart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {
    public static void main(String[] args) {
//        读入xml文件
        ApplicationContext Context = new ClassPathXmlApplicationContext("/beans.xml");
//        读取配置好的bean
        Student student = (Student) Context.getBean("student");
//        运行helloworld的方法
        System.out.println(student);

    }

    }
