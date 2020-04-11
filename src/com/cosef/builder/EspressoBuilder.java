package com.cosef.builder;

public class EspressoBuilder implements CoffeeBuilder {
    @Override
    public void kahveyiHazirla() {
        System.out.println("2 yemek kaþýðý kadar espresso için öðütülmüþ kahve hazýrlayýn.");
    }

    @Override
    public void suyuKaynat() {
        System.out.println("Suyu kaynatýn ve kahveyi hazýrlamadan önce yaklaþýk 30 saniye kadar soðumasýna izin verin.");
    }

    @Override
    public void suyuDokun() {
        System.out.println("Öðütülmüþ kahveyi French Press’e yerleþtirin. Normalde kullandýðýnýz iki katý kadar kahve kullanmak tadýnýn sert olmasýný saðlayacaktýr." +
                "Suyu yavaþça kahvenin üstüne dökün. ");
    }

    @Override
    public void bekle() {
        System.out.println("Yaklaþýk 3-4 dakika boyunca demlenmesi için bekleyin.");
    }

    @Override
    public void suyaHazirladiginEspressoyuEkle() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void hazir() {
        System.out.println("Üstten bastýrýn ve kahvenin dibe çökmesine izin verin." +
                "Kahveniz hazýr.");
    }
}
