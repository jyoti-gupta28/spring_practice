package com.springcore.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

//@Component("firstStudent")
public class Student {

    private Samosa samosa;

    public Samosa getSamosa() {
        return samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }

    public Student(Samosa samosa) {
        this.samosa = samosa;
    }

    public void study()
    {
        this.samosa.display();
        System.out.println("student is reading book");
    }


}
