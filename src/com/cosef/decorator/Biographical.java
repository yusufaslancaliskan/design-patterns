package com.cosef.decorator;

public class Biographical extends TypeDecorator {
    private Type type;

    public Biographical(Type type) {
        this.type = type;
    }

    @Override
    public String getContents() {
        return type.getContents() + ", Biographical";
    }
}
