package com.cosef.builder;

public class EspressoBuilder implements CoffeeBuilder {
    @Override
    public void kahveyiHazirla() {
        System.out.println("2 yemek ka���� kadar espresso i�in ���t�lm�� kahve haz�rlay�n.");
    }

    @Override
    public void suyuKaynat() {
        System.out.println("Suyu kaynat�n ve kahveyi haz�rlamadan �nce yakla��k 30 saniye kadar so�umas�na izin verin.");
    }

    @Override
    public void suyuDokun() {
        System.out.println("���t�lm�� kahveyi French Press�e yerle�tirin. Normalde kulland���n�z iki kat� kadar kahve kullanmak tad�n�n sert olmas�n� sa�layacakt�r." +
                "Suyu yava��a kahvenin �st�ne d�k�n. ");
    }

    @Override
    public void bekle() {
        System.out.println("Yakla��k 3-4 dakika boyunca demlenmesi i�in bekleyin.");
    }

    @Override
    public void suyaHazirladiginEspressoyuEkle() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void hazir() {
        System.out.println("�stten bast�r�n ve kahvenin dibe ��kmesine izin verin." +
                "Kahveniz haz�r.");
    }
}
