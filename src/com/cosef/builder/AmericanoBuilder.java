package com.cosef.builder;

public class AmericanoBuilder implements CoffeeBuilder {

    @Override
    public void kahveyiHazirla() {
        System.out.println("Haz�rlad���n�z Espressoyu al�n.");
    }

    @Override
    public void suyuKaynat() {
        System.out.println("Suyu kaynat�n ve barda�a ekleyin.");
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
        System.out.println("Espressonuzu fincan�n�z�n kenar�ndan ekleyin. Bu sayede espresso, fincan�n en alt k�sm�na kadar inecek ve su ile iyice kar��acakt�r.");
    }

    @Override
    public void hazir() {
        System.out.println("Americanonuz haz�r.");
    }
}
