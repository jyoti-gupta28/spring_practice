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
        System.out.println(student.hashCode());
        Student student1 = context.getBean("ob", Student.class);
        System.out.println(student1.hashCode());

        System.out.println("-----------Teacher---------------");
        Teacher t1=context.getBean("teacher", Teacher.class);
        Teacher t2=context.getBean("teacher", Teacher.class);
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());


    }
}
