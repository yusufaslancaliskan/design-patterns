package com.cosef.builder;

public class AmericanoBuilder implements CoffeeBuilder {

    @Override
    public void kahveyiHazirla() {
        System.out.println("Hazýrladýðýnýz Espressoyu alýn.");
    }

    @Override
    public void suyuKaynat() {
        System.out.println("Suyu kaynatýn ve bardaða ekleyin.");
    }

    @Override
    public void suyuDokun() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void bekle() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void suyaHazirladiginEspressoyuEkle() {
        System.out.println("Espressonuzu fincanýnýzýn kenarýndan ekleyin. Bu sayede espresso, fincanýn en alt kýsmýna kadar inecek ve su ile iyice karýþacaktýr.");
    }

    @Override
    public void hazir() {
        System.out.println("Americanonuz hazýr.");
    }
}
