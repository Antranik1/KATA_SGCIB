package com.kata.foobarquix.services

import com.kata.foobarquix.utils.FooBarQuixStringsEnum
import com.kata.foobarquix.utils.FooBarQuixTraitementsMetiers
import org.springframework.stereotype.Component

@Component
class FooBarQuixService {

    fun convertNumber(inputNumber: Int): String {
        var convertedNumber = StringBuilder();
        convertedNumber.append(inputNumber.toString())
            .append(FooBarQuixStringsEnum.SHOULD_RETURN.texte);

        if (!FooBarQuixTraitementsMetiers.isDivisible357(inputNumber)
            && !FooBarQuixTraitementsMetiers.isContain357(inputNumber)) {
            return convertedNumber.append(inputNumber).toString();
        }

        convertedNumber.append(FooBarQuixTraitementsMetiers.ajoutFoo(inputNumber));
        convertedNumber.append(FooBarQuixTraitementsMetiers.ajoutBar(inputNumber));

        convertedNumber.append(FooBarQuixTraitementsMetiers.fooBarQuixMethod(inputNumber));

        return convertedNumber.toString();
    }

}