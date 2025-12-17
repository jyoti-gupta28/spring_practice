package com.practice.CollectionInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("practiceConfig1.xml");
        Question question=context.getBean("question", Question.class);
        System.out.println(question);

    }
}
