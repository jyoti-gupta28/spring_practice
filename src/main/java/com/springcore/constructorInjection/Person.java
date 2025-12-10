package com.springcore.constructorInjection;

import java.util.List;

public class Person {
    private String name;
    private int id;
    private Certi certi;
    private List<String> list;

    @Override
    public String toString() {
        return "Person{" +
                "certi=" + certi +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", list=" + list +
                '}';
    }
//    @Override
//    public String toString() {
//        return "Person{" +
//                "certi=" + certi +
//                ", name='" + name + '\'' +
//                ", id=" + id +
//                '}';
//    }

    //    public Person(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }

    public Person(int id, String name, Certi certi,List<String> list) {
        this.id = id;
        this.name = name;
        this.certi=certi;
        this.list=list;
    }
}
