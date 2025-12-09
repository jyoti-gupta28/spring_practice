package com.springcore.Collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
    private String name;
    private List<String> phones;
    private Set<String> address;
    private Map<String,String> courses;

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                ", name='" + name + '\'' +
                ", phones=" + phones +
                ", courses=" + courses +
                '}';
    }

    public Emp(Set<String> address, Map<String, String> courses, String name, List<String> phones) {
        this.address = address;
        this.courses = courses;
        this.name = name;
        this.phones = phones;
    }

    public Emp() {
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}
