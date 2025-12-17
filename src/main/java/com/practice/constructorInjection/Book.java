package com.practice.constructorInjection;

public class Book {
    private int book;
    private String bookName;

    public Book() {
        System.out.println("no arg constructor");
    }

    public Book(int book, String bookName) {
        System.out.println("constructor injection");
        this.book = book;
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book=" + book +
                ", bookName='" + bookName + '\'' +
                '}';
    }

    public int getBook() {
        return book;
    }

    public void setBook(int book) {
        System.out.println("Setter injection");
        this.book = book;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
