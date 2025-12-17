package com.practice.ReferenceInjectionj;

public class student {
    private int id;
    private Address address;

    public student() {
    }

    @Override
    public String toString() {
        return "student{" +
                "address=" + address +
                ", id=" + id +
                '}';
    }

    public student(Address address, int id) {
        this.address = address;
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
