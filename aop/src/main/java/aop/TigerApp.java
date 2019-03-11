package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TigerApp {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("/tiger.xml");
        Tiger tiger=context.getBean(Tiger.class);
        tiger.walk();
    }
}
