package com.cosef.decorator;

public class Book extends Type {
    private String writer;
    private String name;

    public Book(String name, String writer) {
        this.name = name;
        this.writer = writer;
        type = "Book";
    }

    @Override
    public String getContents() {
        return name + " is written by " + writer + " and is a/an" + getType();
    }

}
