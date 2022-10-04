package d.collection.practice;

import java.util.ArrayList;

public class ManageHeigth {
	ArrayList<ArrayList<Integer>> gradeHeigths = new ArrayList<ArrayList<Integer>>();

	public static void main(String[] args) {
		ManageHeigth heigth = new ManageHeigth();
		heigth.setData();
		
//		for (int loop = 1; loop <= 5; loop++) {
//			heigth.printHeigth(loop);
//		}

		int i = 0;
		while(i<5) {
			heigth.printAverage(i);
			i++;
		}
	}

	public void setData() {
		ArrayList<Integer> class1 = new ArrayList<Integer>();
		ArrayList<Integer> class2 = new ArrayList<Integer>();
		ArrayList<Integer> class3 = new ArrayList<Integer>();
		ArrayList<Integer> class4 = new ArrayList<Integer>();
		ArrayList<Integer> class5 = new ArrayList<Integer>();

		class1.add(170);
		class1.add(180);
		class1.add(173);
		class1.add(175);
		class1.add(177);
		gradeHeigths.add(class1);

		class2.add(160);
		class2.add(165);
		class2.add(167);
		class2.add(186);
		gradeHeigths.add(class2);

		class3.add(158);
		class3.add(177);
		class3.add(187);
		class3.add(176);
		gradeHeigths.add(class3);

		class4.add(173);
		class4.add(182);
		class4.add(181);
		gradeHeigths.add(class4);

		class5.add(170);
		class5.add(180);
		class5.add(165);
		class5.add(177);
		class5.add(172);
		gradeHeigths.add(class5);

	}

	public void printHeigth(int classNo) {
		ArrayList<Integer> classHeigth = gradeHeigths.get(classNo - 1);

		System.out.println("Class No : " + classNo);

		for (Integer temp : classHeigth) {
			System.out.println(temp);
		}
		System.out.println();
	}

	public void printAverage(int classNo) {
		double avg = 0.0;
		int sum = 0;

		ArrayList<Integer> classHeigth = gradeHeigths.get(classNo);

		System.out.println("Class No : " + classNo+1);

		for (Integer temp : classHeigth) {
			sum += temp;
		}
		avg = (double) sum / classHeigth.size();

		System.out.println("Height average : " + avg);
	}
}
