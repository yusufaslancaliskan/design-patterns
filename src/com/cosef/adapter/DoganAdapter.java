package com.cosef.adapter;

public class DoganAdapter implements Atmacagiller {

    private Dogan dogan;

    public DoganAdapter(Dogan dogan) {
        this.dogan = dogan;
    }

    @Override
    public String atmacagilllerTakimindadir() {
        return dogan.gunduzYirticiKusuTakimindadir();
    }

    @Override
    public String ormanlikAlanlardaYasar() {
        return dogan.daglikBolgelerdeYasar();
    }
}
