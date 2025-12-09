package org.example;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        System.out.println("setting student address");
        this.studentAddress = studentAddress;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        System.out.println("setting student id");
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        System.out.println("setting student name");
        this.studentName = studentName;
    }

    public Student(String studentAddress, int studentId, String studentName) {
        this.studentAddress = studentAddress;
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentAddress='" + studentAddress + '\'' +
                ", studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
