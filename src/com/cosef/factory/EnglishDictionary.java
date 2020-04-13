package com.cosef.factory;

public class EnglishDictionary extends Dictionary {
    @Override
    public Language getLanguage() {
        return new English();
    }
}
