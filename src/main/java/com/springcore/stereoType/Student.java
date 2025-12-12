package com.springcore.stereoType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("ob")
public class Student {
    @Value("Jyoti Gupta")
    private String studentName;
    @Value("Pune")
    private String city;

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    @Value("#{temp}")
    private List<String> address;

    @Override
    public String toString() {
        return "Student{" +
                "city='" + city + '\'' +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
