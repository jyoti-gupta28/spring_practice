package com.springcore.AutowiringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

//    using in first case the annotation here
//@Qualifier is used to tell Spring which exact bean you want to inject when multiple beans of the same type exist.
    @Autowired
    @Qualifier("address1")
    private Address address;


    public Emp() {
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    //in second case we can use @Autowired here , for setter injection
//    @Autowired
    public void setAddress(Address address) {

        System.out.println("setting values");
        this.address = address;
    }
//in third case we can use @Autowired here , for constructor injection
//    @Autowired
    public Emp(Address address) {
        System.out.println("inside constructor");
        this.address = address;
    }
}
