package com.spring.IoC.annotation;
import lombok.Data;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ComponentScan
 * 用于寻找用@Component注解标注的bean
 */

@ComponentScan
@Data
public class StudentApp {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext();
        Student student=context.getBean(Student.class);
        //运行
        System.out.println(student);
    }


}
