package aop;

/*
用户自定义的前值增强类
 */
public class MyBeforeAdvice {


    public  void beforeMethod(){

        System.out.println("This is a before method.");
    }
}
