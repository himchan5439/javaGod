package test;

import java.util.Random;

public class ArrayLotto {
	
	public static void main(String[] args) {
		ArrayLotto lotto = new ArrayLotto();
		
		lotto.intt();
	}
	
	private void intt() {
		Random random = new Random();
		
		int[] lottoNumbers = new int[7];
		
		for(int i = 0; i<7; i++) {
			lottoNumbers[i] = random.nextInt(45);
			if(lottoNumbers[i] == 0) {
				i--;
				continue;
			}
			System.out.println(lottoNumbers[i]);
		}
	}
	
}
