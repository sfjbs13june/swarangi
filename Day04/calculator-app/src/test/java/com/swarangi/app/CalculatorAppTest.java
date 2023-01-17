package com.swarangi.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class CalculatorAppTest {
	CalculatorAppController calculator = new CalculatorAppController();
	@Test
	public void testrequestAdd(){
		double a=4.0;
		double b=4.0;
		double expectedResult = 8.0;
		double result= calculator.add(a,b);
		Assertions.assertEquals(expectedResult,result,0.00);
	}
	@Test
	public void testrequestSub(){
		double a=4.0;
		double b=4.0;
		double expectedResult = 0.0;
		double result= calculator.sub(a,b);
		Assertions.assertEquals(expectedResult,result,0.00);
	}
	@Test
	public void testrequestMulti(){
		double a=4.0;
		double b=4.0;
		double expectedResult = 16.0;
		double result= calculator.multi(a,b);
		Assertions.assertEquals(expectedResult,result,0.00);
	}
	@Test
	public void testrequestDiv(){
		double a=4.0;
		double b=4.0;
		double expectedResult = 1.0;
		double result= calculator.div(a,b);
		Assertions.assertEquals(expectedResult,result,0.00);
	}


}
