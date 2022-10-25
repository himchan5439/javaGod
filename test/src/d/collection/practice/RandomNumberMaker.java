package d.collection.practice;

import java.util.HashSet;
import java.util.Random;
//import java.util.Set;

public class RandomNumberMaker {
	public static void main(String[] args) {
		RandomNumberMaker sample = new RandomNumberMaker();
		for(int i = 0; i < 10; i++) {			
			System.out.println(sample.getSixNumber());
		}
	}

	public HashSet<Integer> getSixNumber() {
		Random random = new Random();
		HashSet<Integer> numberSet = new HashSet<Integer>();
		while (true) {
			int tempNumber = random.nextInt(44) + 1;
			numberSet.add(tempNumber);
			if (numberSet.size() == 6)
				break;
		}
		return numberSet;
	}
}
