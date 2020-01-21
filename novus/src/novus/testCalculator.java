package novus;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import novus.calculator;

class testCalculator {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testAdd() {
		calculator calculator = new calculator();
		int a = 25;
		int b = 65;
		int sum = calculator.add(a,b);
		int expected = 90;
		
		assertEquals(expected, sum);
	}
	
	@Test
	void testSubtract() {
		calculator calculator = new calculator();
		int a = 90;
		int b = 65;
		int subtract = calculator.subtract(a,b);
		int expected = 25;
		
		assertEquals(expected, subtract);
	}
	
	@Test
	void testDivsion() {
		calculator calculator = new calculator();
		int a = 10;
		int b = 2;
		float divsion = calculator.division(a,b);
		int expected = 5;
		
		assertEquals(expected, divsion);
	}
	
	@Test
	void testMultiplication() {
		calculator calculator = new calculator();
		int a = 10;
		int b = 2;
		int multiplication = calculator.multiplication(a,b);
		int expected = 20;
		
		assertEquals(expected, multiplication);
	}
	
	@AfterEach
	void tearDown() throws Exception {
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

}
