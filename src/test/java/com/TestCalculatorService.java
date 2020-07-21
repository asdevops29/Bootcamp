package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.CalculatorService;

@ExtendWith(SpringExtension.class)
@SpringBootTest

public class TestCalculatorService {
	
	@Test
	public void testAddition() {
	CalculatorService calculatorService = new CalculatorService();
	Assertions.assertEquals(30, calculatorService.addition());
	}
	
	@Test
	public void testSubtraction() {
	CalculatorService calculatorService = new CalculatorService();
	Assertions.assertEquals(10, calculatorService.subtraction());
	}
	
	@Test
	public void testMultiplication() {
	CalculatorService calculatorService = new CalculatorService();
	Assertions.assertEquals(200, calculatorService.multiplication());
	}
	
	@Test
	public void testDivision() {
	CalculatorService calculatorService = new CalculatorService();
	Assertions.assertEquals(2, calculatorService.division());
	}
	
	@Test
	public void testModulus() {
	CalculatorService calculatorService = new CalculatorService();
	Assertions.assertEquals(0, calculatorService.modulus());
	}
	
}
