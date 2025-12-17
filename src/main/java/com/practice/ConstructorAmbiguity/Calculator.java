package com.practice.ConstructorAmbiguity;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        System.out.println("integer constructor");
        this.a = a;
        this.b = b;
    }
    public Calculator(double a , double b)
    {
        System.out.println("double constructor");
        this.a=(int)a;
        this.b=(int)b;
    }
    public Calculator(String a , String b)
    {
        System.out.println("String Constructor");
        this.a=Integer.parseInt(a);
        this.b=Integer.parseInt(b);
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
