package test;

public class SalaryManager {
	public static void main(String[] args) {
		SalaryManager manager = new SalaryManager();
		
		manager.getMonthlySalary(20000000);
	}
	public double getMonthlySalary(int yearlySalary){
		
		double monthSalary = yearlySalary/12.0;
		
		double tax = calculateTax(monthSalary);
		double pension = calculateNationalPension(monthSalary);
		double insurance = calculateHealthInsurance(monthSalary);
		
		double sum = tax+pension+insurance;
		
		yearlySalary-=sum;
		System.out.println(sum);
		
		return yearlySalary;	
	}
	public double calculateTax(double monthSalary) {
		monthSalary = monthSalary*(12.5/100);
		
		System.out.println(monthSalary);
		return monthSalary;
	}
	public double calculateNationalPension(double monthSalary) {
		monthSalary = monthSalary*(8.1/100);
		
		System.out.println(monthSalary);
		return monthSalary;
	}
	public double calculateHealthInsurance(double monthSalary) {
		monthSalary = monthSalary*(13.5/100);
		
		System.out.println(monthSalary);
		return monthSalary;		
	}
}
