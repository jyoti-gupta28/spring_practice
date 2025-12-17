package com.practice.ConstructorAmbiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("practiceConfig1.xml");
        Calculator calculator=context.getBean("calculator",Calculator.class);
        System.out.println(calculator);
    }
}
