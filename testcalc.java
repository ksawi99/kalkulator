package kalkulator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testcalc {
	
	private Calculator calculator;

	@Test
	public void checkAddingIsCorrect() {
	    calculator = new Calculator();
				
		assertEquals(7.0, calculator.add(3.0, 4.0), "Error while adding");
	}
	
	@Test
	public void checkAddingIsInCorrect() {
	    calculator = new Calculator();
				
		assertNotEquals(8.0, calculator.add(3.0, 4.0), "Error while adding");

	}
	
	@Test
	public void checkIsDivideByZero() {
	    calculator = new Calculator();
	    
	    Throwable exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(3.0, 0.0));
	    assertNotNull(exception);	  

	}
	
	@Test
	public void checkDivideIsCorrect() {
	    calculator = new Calculator();
				
		assertEquals(2.0, calculator.divide(4.0, 2.0), "Error while divide");

	
	}
	@Test
	public void checkDivideIsInCorrect() {
	    calculator = new Calculator();
				
		assertNotEquals(8.0, calculator.divide(3.0, 4.0), "Error while adding");
}
	@Test
	public void checkSubIsCorrect() {
	    calculator = new Calculator();
				
		assertEquals(2.0, calculator.sub(6.0, 4.0), "Error while adding");
	}
	@Test
	public void checkSubIsInCorrect() {
	    calculator = new Calculator();
				
		assertNotEquals(7.0, calculator.sub(8.0, 4.0), "Error while adding");
	}
	@Test
	public void checkMulIsCorrect() {
	    calculator = new Calculator();
				
		assertEquals(24.0, calculator.mul(6.0, 4.0), "Error while adding");
}
	@Test
	public void checkMulIsInCorrect() {
	    calculator = new Calculator();
				
		assertNotEquals(7.0, calculator.sub(8.0, 4.0), "Error while adding");
	}
}