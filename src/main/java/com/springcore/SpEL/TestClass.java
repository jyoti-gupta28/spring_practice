package com.springcore.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestClass {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpELconfig.xml");
        Demo demo = context.getBean("demo", Demo.class);
        System.out.println(demo);
//        SpelExpressionParser temp=new SpelExpressionParser();
//        Expression expression= temp.parseExpression("22+44");
//        System.out.println("expression = "+expression.getValue());


    }
}
