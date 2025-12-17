package com.practice.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("practiceConfig1.xml");
        Book book=context.getBean("book", Book.class);
        System.out.println(book);
    }
}
