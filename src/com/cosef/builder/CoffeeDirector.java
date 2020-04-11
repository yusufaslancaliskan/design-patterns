package com.cosef.builder;

public class CoffeeDirector {

    private CoffeeBuilder coffeeBuilder;

    public CoffeeDirector(CoffeeBuilder coffeeBuilder) {
        this.coffeeBuilder = coffeeBuilder;
    }

    public void changeBuilder(CoffeeBuilder coffeeBuilder) {
        this.coffeeBuilder = coffeeBuilder;
    }

    public void hazirla() {
        if (coffeeBuilder instanceof EspressoBuilder) {
            espressoHazirlayin();
        } else if (coffeeBuilder instanceof AmericanoBuilder) {
            americanoHazirla();
        }
    }

    public void espressoHazirlayin() {
        this.coffeeBuilder.kahveyiHazirla();
        this.coffeeBuilder.suyuKaynat();
        this.coffeeBuilder.suyuDokun();
        this.coffeeBuilder.bekle();
        this.coffeeBuilder.hazir();
    }


    public void americanoHazirla() {
        this.coffeeBuilder.kahveyiHazirla();
        this.coffeeBuilder.suyuKaynat();
        this.coffeeBuilder.suyaHazirladiginEspressoyuEkle();
        this.coffeeBuilder.hazir();
    }


}
