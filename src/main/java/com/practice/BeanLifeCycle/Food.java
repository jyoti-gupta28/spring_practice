package com.practice.BeanLifeCycle;

public class Food {
    private String name;

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                '}';
    }

    public void init()
    {
        System.out.println("init method");
    }

    public Food() {
    }

    public void destroy()
    {
        System.out.println("destroy method");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food(String name) {
        this.name = name;
    }
}
