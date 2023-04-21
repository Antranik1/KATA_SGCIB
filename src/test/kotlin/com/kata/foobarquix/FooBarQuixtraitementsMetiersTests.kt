package com.kata.foobarquix

import com.kata.foobarquix.utils.FooBarQuixStringsEnum
import com.kata.foobarquix.utils.FooBarQuixTraitementsMetiers
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
// utiliser junit
// assert de kotlin
class FooBarQuixtraitementsMetiersTests {
    @Test
    fun isDivisibleEnonce_test_3()  {
        // data
        var entree = 3;

        // do
        var result = FooBarQuixTraitementsMetiers.isDivisible357(entree);

        // expect
        assert(result.equals(true));
    }
    @Test
    fun isDivisibleEnonce_test_5()  {
        // data
        var entree = 5;

        // do
        var result = FooBarQuixTraitementsMetiers.isDivisible357(entree);

        // expect
        assert(result.equals(true));
    }
    @Test
    fun isDivisibleEnonce_test_7()  {
        // data
        var entree = 7;

        // do
        var result = FooBarQuixTraitementsMetiers.isDivisible357(entree);

        // expect
        assert(result.equals(true));
    }
    @Test
    fun isDivisibleEnonce_test_105()  {
        // data
        var entree = 105;

        // do
        var result = FooBarQuixTraitementsMetiers.isDivisible357(entree);

        // expect
        assert(result.equals(true));
    }
    @Test
    fun isDivisibleEnonce_test_11()  {
        // data
        var entree = 11;

        // do
        var result = FooBarQuixTraitementsMetiers.isDivisible357(entree);

        // expect
        assert(result.equals(false));
    }

    @Test
    fun isContain357test_3()  {
        // data
        var entree = 3;

        // do
        var result = FooBarQuixTraitementsMetiers.isContain357(entree);

        // expect
        assert(result.equals(true));
    }
    @Test
    fun isContain357test_5()  {
        // data
        var entree = 5;

        // do
        var result = FooBarQuixTraitementsMetiers.isContain357(entree);

        // expect
        assert(result.equals(true));
    }
    @Test
    fun isContain357test_7()  {
        // data
        var entree = 7;

        // do
        var result = FooBarQuixTraitementsMetiers.isContain357(entree);

        // expect
        assert(result.equals(true));
    }
    @Test
    fun isContain357test_105()  {
        // data
        var entree = 105;

        // do
        var result = FooBarQuixTraitementsMetiers.isContain357(entree);

        // expect
        assert(result.equals(true));
    }
    @Test
    fun isContain357test_11()  {
        // data
        var entree = 11;

        // do
        var result = FooBarQuixTraitementsMetiers.isContain357(entree);

        // expect
        assert(result.equals(false));
    }

    @Test
    fun ajoutFoo_test()  {
        // data
        var entree = 3;

        // do
        var result = FooBarQuixTraitementsMetiers.ajoutFoo(entree);

        // expect
        assert(result.equals(FooBarQuixStringsEnum.FOO.texte));
    }
    @Test
    fun ajoutFoo_test_ko()  {
        // data
        var entree = 11;

        // do
        var result = FooBarQuixTraitementsMetiers.ajoutFoo(entree);

        // expect
        assert(result.equals(""));
    }
    @Test
    fun ajoutBar_test()  {
        // data
        var entree = 5;

        // do
        var result = FooBarQuixTraitementsMetiers.ajoutBar(entree);

        // expect
        assert(result.equals(FooBarQuixStringsEnum.BAR.texte));
    }
    @Test
    fun ajoutBar_test_ko()  {
        // data
        var entree = 11;

        // do
        var result = FooBarQuixTraitementsMetiers.ajoutBar(entree);

        // expect
        assert(result.equals(""));
    }

    @Test
    fun fooBarQuixMethod_3() {
        // data
        var entree = 3;

        // do
        var result = FooBarQuixTraitementsMetiers.fooBarQuixMethod(entree);

        // expect
        assert(result.equals(FooBarQuixStringsEnum.FOO.texte));
    }
    @Test
    fun fooBarQuixMethod_5() {
        // data
        var entree = 5;

        // do
        var result = FooBarQuixTraitementsMetiers.fooBarQuixMethod(entree);

        // expect
        assert(result.equals(FooBarQuixStringsEnum.BAR.texte));
    }
    @Test
    fun fooBarQuixMethod_7() {
        // data
        var entree = 7;

        // do
        var result = FooBarQuixTraitementsMetiers.fooBarQuixMethod(entree);

        // expect
        assert(result.equals(FooBarQuixStringsEnum.QUIX.texte));
    }
    @Test
    fun fooBarQuixMethod_2() {
        // data
        var entree = 2;

        // do
        var result = FooBarQuixTraitementsMetiers.fooBarQuixMethod(entree);

        // expect
        assert(result.equals(""));
    }
    @Test
    fun fooBarQuixMethod_357() {
        // data
        var entree = 357;
        var sortie = StringBuilder();
        sortie.append(FooBarQuixStringsEnum.FOO.texte)
            .append(FooBarQuixStringsEnum.BAR.texte)
            .append(FooBarQuixStringsEnum.QUIX.texte);

        // do
        var result = FooBarQuixTraitementsMetiers.fooBarQuixMethod(entree);

        // expect
        assert(result.equals(sortie.toString()));
    }
}