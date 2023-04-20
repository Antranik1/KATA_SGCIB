package com.kata.foobarquix.utils;

public enum FooBarQuixStringsEnum {
    SHOULD_RETURN(" should return "),
    FOO("Foo"),
    BAR("Bar"),
    QUIX("Quix");

    private final String texte;

    private FooBarQuixStringsEnum(String texte) {
        this.texte = texte;
    }

    public String getTexte() {
        return texte;
    }
}
