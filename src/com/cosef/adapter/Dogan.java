package com.cosef.adapter;

public class Dogan implements Dogangiller {
    @Override
    public String gunduzYirticiKusuTakimindadir() {
        return "Ben Doğan Gündüz yırtıcı kuşu takımındanım";
    }

    @Override
    public String daglikBolgelerdeYasar() {
        return " ve dağlık bölgelerde yaşarım.";
    }
}
