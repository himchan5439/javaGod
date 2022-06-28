package c.exception.practice;

public class Calculator {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		calc.printDivide(1, 2);
		calc.printDivide(1, 0);
	}
	
	public void printDivide(double d1, double d2){
		double result = d1/d2;
		System.out.println(result);
	}
}
