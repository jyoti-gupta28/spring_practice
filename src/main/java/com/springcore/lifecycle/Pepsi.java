package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean{
    private double price;

    public Pepsi() {
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //this will work for init
        System.out.println("taking pepsi : init");
    }

    @Override
    public void destroy() throws Exception {
        //this will work for destroy method
        System.out.println("going to put the bottle back to shop : destroy");
    }
}
