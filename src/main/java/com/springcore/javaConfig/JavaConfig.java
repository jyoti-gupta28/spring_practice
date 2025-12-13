package com.springcore.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaConfig")
public class JavaConfig {
    @Bean(name = {"student","temp","con"})
    public Student getStudent(){
        //creatinga student object
        Student student=new Student(getSamosa());
        return student;
    }

    @Bean
    public Samosa getSamosa()
    {
        return new Samosa();
    }


}
