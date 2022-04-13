package test;

public class InterestManager {
	
	public static void main(String[] args) {
		InterestManager manager = new InterestManager();
		int day = 365;
		long seedMoney = 1000000;
		for (int i = 1; i <= day; i++) {
			long interest = Math.round(manager.calculateAmount(i, seedMoney));
			seedMoney = seedMoney + interest;
			System.out.printf("이자 : %d원 저축금액 : %d\n", interest, seedMoney);
		}
	}
	
	private double getInterestRate(int day) {
		double interest = 0;
		if(day <= 90 && day >= 1) {
			interest = 0.5;
		}else if(day <= 180 && day >= 91) {
			interest = 1;
		}else if(day <= 365 && day >= 181) {
			interest = 2;
		}else if(day >= 365) {
			interest = 5.6;
		}
		return interest;
	}
	private double calculateAmount(int day, long amount) {		
		double interest = getInterestRate(day);
		double money = amount/100*interest;
		
		return money;
	}
}
