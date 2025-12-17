package com.practice.ReferenceInjectionj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("practiceConfig1.xml");
        student student=context.getBean("student", student.class);
        System.out.println(student);
        student student1=context.getBean("student1", student.class);
        System.out.println(student1);
    }
}
