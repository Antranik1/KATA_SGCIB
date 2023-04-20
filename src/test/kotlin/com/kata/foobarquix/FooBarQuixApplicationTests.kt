package com.kata.foobarquix

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import com.kata.foobarquix.services.FooBarQuixService
import com.kata.foobarquix.utils.FooBarQuixStringsEnum

@SpringBootTest
class FooBarQuixApplicationTests {

	@Autowired
	private lateinit var fooBarQuixService: FooBarQuixService;

	@Test
	fun cas_simple_entier_egal_1() {
		// data
		var entree = 1;
		var retourExpected = StringBuilder();
		retourExpected.append(entree).append(FooBarQuixStringsEnum.SHOULD_RETURN.texte)
			.append(entree);

		// do
		var result = fooBarQuixService.convertNumber(entree);

		// expect
		assert(result.equals(retourExpected.toString()));
	}
	@Test
	fun cas_simple_entier_egal_3() {
		// data
		var entree = 3;
		var retourExpected = StringBuilder();
		retourExpected.append(entree).append(FooBarQuixStringsEnum.SHOULD_RETURN.texte)
			.append(FooBarQuixStringsEnum.FOO.texte).append(FooBarQuixStringsEnum.FOO.texte);

		// do
		var result = fooBarQuixService.convertNumber(entree);

		// expect
		assert(result.equals(retourExpected.toString()));
	}
	@Test
	fun cas_simple_entier_egal_5() {
		// data
		var entree = 5;
		var retourExpected = StringBuilder();
		retourExpected.append(entree).append(FooBarQuixStringsEnum.SHOULD_RETURN.texte)
			.append(FooBarQuixStringsEnum.BAR.texte).append(FooBarQuixStringsEnum.BAR.texte);

		// do
		var result = fooBarQuixService.convertNumber(entree);

		// expect
		assert(result.equals(retourExpected.toString()));
	}
	@Test
	fun cas_simple_entier_egal_7() {
		// data
		var entree = 7;
		var retourExpected = StringBuilder();
		retourExpected.append(entree).append(FooBarQuixStringsEnum.SHOULD_RETURN.texte)
			.append(FooBarQuixStringsEnum.QUIX.texte);

		// do
		var result = fooBarQuixService.convertNumber(entree);

		// expect
		assert(result.equals(retourExpected.toString()));
	}
	@Test
	fun cas_simple_entier_egal_9() {
		// data
		var entree = 9;
		var retourExpected = StringBuilder();
		retourExpected.append(entree).append(FooBarQuixStringsEnum.SHOULD_RETURN.texte)
			.append(FooBarQuixStringsEnum.FOO.texte);

		// do
		var result = fooBarQuixService.convertNumber(entree);

		// expect
		assert(result.equals(retourExpected.toString()));
	}
	@Test
	fun cas_simple_entier_egal_51() {
		// data
		var entree = 51;
		var retourExpected = StringBuilder();
		retourExpected.append(entree).append(FooBarQuixStringsEnum.SHOULD_RETURN.texte)
			.append(FooBarQuixStringsEnum.FOO.texte).append(FooBarQuixStringsEnum.BAR.texte);

		// do
		var result = fooBarQuixService.convertNumber(entree);

		// expect
		assert(result.equals(retourExpected.toString()));
	}
	@Test
	fun cas_simple_entier_egal_53() {
		// data
		var entree = 53;
		var retourExpected = StringBuilder();
		retourExpected.append(entree).append(FooBarQuixStringsEnum.SHOULD_RETURN.texte)
			.append(FooBarQuixStringsEnum.BAR.texte).append(FooBarQuixStringsEnum.FOO.texte);

		// do
		var result = fooBarQuixService.convertNumber(entree);

		// expect
		assert(result.equals(retourExpected.toString()));
	}
	@Test
	fun cas_simple_entier_egal_33() {
		// data
		var entree = 33;
		var retourExpected = StringBuilder();
		retourExpected.append(entree).append(FooBarQuixStringsEnum.SHOULD_RETURN.texte)
			.append(FooBarQuixStringsEnum.FOO.texte).append(FooBarQuixStringsEnum.FOO.texte)
			.append(FooBarQuixStringsEnum.FOO.texte);

		// do
		var result = fooBarQuixService.convertNumber(entree);

		// expect
		assert(result.equals(retourExpected.toString()));
	}
	@Test
	fun cas_simple_entier_egal_27() {
		// data
		var entree = 27;
		var retourExpected = StringBuilder();
		retourExpected.append(entree).append(FooBarQuixStringsEnum.SHOULD_RETURN.texte)
			.append(FooBarQuixStringsEnum.FOO.texte).append(FooBarQuixStringsEnum.QUIX.texte);

		// do
		var result = fooBarQuixService.convertNumber(entree);

		// expect
		assert(result.equals(retourExpected.toString()));
	}
	@Test
	fun cas_simple_entier_egal_15() {
		// data
		var entree = 15;
		var retourExpected = StringBuilder();
		retourExpected.append(entree).append(FooBarQuixStringsEnum.SHOULD_RETURN.texte)
			.append(FooBarQuixStringsEnum.FOO.texte).append(FooBarQuixStringsEnum.BAR.texte)
			.append(FooBarQuixStringsEnum.BAR.texte);

		// do
		var result = fooBarQuixService.convertNumber(entree);

		// expect
		assert(result.equals(retourExpected.toString()));
	}
}
