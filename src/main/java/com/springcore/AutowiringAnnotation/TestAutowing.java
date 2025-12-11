package com.springcore.AutowiringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestAutowing {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("AutoConfigAnnotation.xml");
        Emp emp1 = context.getBean("emp1", Emp.class);
        System.out.println(emp1);
    }
}
