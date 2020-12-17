package com.cosef.proxy;

public class Platon implements Filozof{

    private Sokrates sokrates;

    public Platon() {
        this.sokrates = new Sokrates();
    }

    @Override
    public void say() {
        System.out.println("Sokrates anlatıyor:");
        sokrates.say();
        System.out.println("Devlet/Platon");
    }
}
