package kalkulator;

public class Calculator {
	
	
	public Calculator () {
		
	}
	
	public double add(double a, double b) {
		return a + b;
	}
	
	public double divide(double a, double b)throws IllegalArgumentException {
		
		if (b == 0.0)
			throw new IllegalArgumentException("Liczba nie może być podzielna przez 0");
		
		return a / b;
	}
	public double sub(double a, double b) {
		return a - b;
	
	}
	public double mul(double a, double b) {
		return a * b;
}
}