package com.cosef.decorator;

public class Action extends TypeDecorator {
    private Type type;

    public Action(Type type) {
        this.type = type;
    }

    @Override
    public String getContents() {
        return type.getContents() + ", Action";
    }
}
