package com.practice.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("practiceConfig1.xml");
        Employee employee=context.getBean("employee", Employee.class);
        System.out.println(employee);
    }
}
