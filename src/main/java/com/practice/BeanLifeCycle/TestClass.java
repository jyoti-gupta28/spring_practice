package com.practice.BeanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("beanLifecycleConfigPractice.xml");
        Food food=context.getBean("food", Food.class);
        context.registerShutdownHook();
    }
}
