package com.cosef.factory;

public abstract class Dictionary {

    public void translate() {
        Language language = getLanguage();
        language.sayHi();
    }

    public abstract Language getLanguage();

}
