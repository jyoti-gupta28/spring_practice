package com.practice.SpringContainerAndApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("practiceConfig1.xml");
        Student student=context.getBean("student", Student.class);
        System.out.println(student);
        Student student1=context.getBean("student1", Student.class);
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
        System.out.println(student1);
    }
}
