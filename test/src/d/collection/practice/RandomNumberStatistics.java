package d.collection.practice;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatistics {
	Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();
	
	public static void main(String[] args) {
		RandomNumberStatistics sample = new RandomNumberStatistics();
		sample.getRandomNumberStatistics();
	}
	
	public void getRandomNumberStatistics() {
		Random random = new Random();
		for(int i = 0; i<5000; i++) {
			int randomNumber = random.nextInt(49) + 1;
			putCurrentNumber(randomNumber);
		}
		printStatistics();
	}
	
	public void putCurrentNumber(int tempNumber) {
		if (hashtable.containsKey(tempNumber)) {
			hashtable.put(tempNumber, hashtable.get(tempNumber) + 1);
		} else {
			hashtable.put(tempNumber, 1);
		}
	}
	
	public void printStatistics() {
		Set<Integer> keySet = hashtable.keySet();
		for (int key : keySet) {
			int count = hashtable.get(key);
			System.out.print(key + "=" + count + "\t");
			if (key % 10 - 1 == 0)
				System.out.println();
		}
	}
}
