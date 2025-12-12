package com.springcore.standAloneCollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private List<String> friends;
    private Map<String,Integer> feeStructure;
    private Properties properties;

    public Person(Map<String, Integer> feeStructure, List<String> friends, Properties properties) {
        this.feeStructure = feeStructure;
        this.friends = friends;
        this.properties = properties;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Person(Map<String, Integer> feeStructure, List<String> friends) {
        this.feeStructure = feeStructure;
        this.friends = friends;
    }

    public Map<String, Integer> getFeeStructure() {
        return feeStructure;
    }

    public void setFeeStructure(Map<String, Integer> feeStructure) {
        this.feeStructure = feeStructure;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "feeStructure=" + feeStructure +
                ", friends=" + friends +
                ", properties=" + properties +
                '}';
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Person(List<String> friends) {
        this.friends = friends;
    }
}
