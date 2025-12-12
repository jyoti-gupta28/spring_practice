package com.springcore.standAloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("StandAloneCollectionConfig.xml");
        Person person=context.getBean("person1", Person.class);
        System.out.println(person.getFriends());
        System.out.println(person.getFriends().getClass());
        System.out.println("--------------------------------------------");
        System.out.println(person.getFeeStructure());
        System.out.println(person.getFeeStructure().getClass());
        System.out.println("--------------------------------------------");
        System.out.println(person.getProperties());
        System.out.println(person.getProperties().getClass());
    }
}
