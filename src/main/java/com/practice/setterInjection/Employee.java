package com.practice.setterInjection;

public class Employee {
    private int id;
    private String empName;
    private String salary;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        System.out.println("setter empName");
        this.empName = empName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Setter setId");
        this.id = id;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
