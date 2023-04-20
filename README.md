# KATA_SGCIB

Write a program that convert an input number into a string according to the following rules :
If the number is divisible by 3 or contains 3, replace 3 by "Foo";
if the number is divisible by 5 or contains 5, replace 5 by "Bar";
if the number contains 7, replace 7 by "Quix".
Divisors have high predecence, the content is analyzed in the order of appearance.
If no match, return the input number as a string.


Here is a list of examples :
1 should return 1
3 should return FooFoo
5 should return BarBar
7 should return Quix
9 should return Foo
51 should return FooBar
53 should return BarFoo
33 should return FooFooFoo
27 should return FooQuix
15 should return FooBarBar

postman :

http://localhost:8080/foo-bar-quix/{number}
