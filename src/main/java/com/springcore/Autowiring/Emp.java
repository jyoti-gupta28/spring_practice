package com.springcore.Autowiring;

public class Emp {

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

    public void setAddress(Address address) {
        this.address = address;
    }

    public Emp(Address address) {
        System.out.println("inside constructor");
        this.address = address;
    }
}
