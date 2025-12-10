package com.springcore.ref;

public class A {

    private int x;
    private B ob;

    @Override
    public String toString() {
        return "A{" +
                "ob=" + ob +
                ", x=" + x +
                '}';
    }

    public B getOb() {
        return ob;
    }

    public void setOb(B ob) {
        this.ob = ob;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public A() {
    }

    public A(B ob, int x) {
        this.ob = ob;
        this.x = x;
    }
}
