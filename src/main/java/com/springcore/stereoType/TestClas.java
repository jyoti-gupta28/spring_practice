package com.springcore.stereoType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClas {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("stereoConfig.xml");
//        Student student = context.getBean("student", Student.class);
        Student student = context.getBean("ob", Student.class);
        System.out.println(student);
        System.out.println(student.getAddress());
        System.out.println(student.getAddress().getClass().getName());

    }
}
