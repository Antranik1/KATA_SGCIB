package com.kata.foobarquix.utils;

public class FooBarQuixTraitementsMetiers {
    // dans service ?
    public static Boolean isDivisible357(int number) {
        return (number % 3 == 0
                || number % 5 == 0
                || number % 7 == 0);
    }

    // dans service ?
    public static Boolean isContain357(int number)  {
        String numberString = String.valueOf(number);
        return numberString.contains("3")
                || numberString.contains("5")
                || numberString.contains("7");
    }

    // dans service ?
    public static String fooBarQuixMethod(int number) {
        StringBuilder retour = new StringBuilder();
        String numberString = String.valueOf(number);
        for(Character c : numberString.toCharArray()) {
            if (c.equals('3')) {
                retour.append(FooBarQuixStringsEnum.FOO.getTexte());
            } else if (c.equals('5')) {
                retour.append(FooBarQuixStringsEnum.BAR.getTexte());
            } else if (c.equals('7')) {
                retour.append(FooBarQuixStringsEnum.QUIX.getTexte());
            }
        }

        return retour.toString();
    }

    public static String ajoutFoo(int number) {
        return (number % 3 == 0) ? FooBarQuixStringsEnum.FOO.getTexte() : "";
    }

    public static String ajoutBar(int number){
        return (number % 5 == 0) ? FooBarQuixStringsEnum.BAR.getTexte() : "";
    }
}
