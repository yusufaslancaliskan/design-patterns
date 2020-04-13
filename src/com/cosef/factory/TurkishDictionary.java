package com.cosef.factory;

public class TurkishDictionary extends Dictionary {
    @Override
    public Language getLanguage() {
        return new Turkish();
    }
}
