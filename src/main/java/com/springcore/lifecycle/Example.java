package com.springcore.lifecycle;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Example {
    private String subject;

    @Override
    public String toString() {
        return "Example{" +
                "subject='" + subject + '\'' +
                '}';
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Example() {
    }
    @PostConstruct
    public void start()
    {
        System.out.println("starting method");
    }
    @PreDestroy
    public void end()
    {
        System.out.println("ending method");
    }
}
