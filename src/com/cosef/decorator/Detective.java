package com.cosef.decorator;

public class Detective extends TypeDecorator {
    private Type type;

    public Detective(Type type) {
        this.type = type;
    }

    @Override
    public String getContents() {
        return type.getContents() + ", Detective";
    }
}
