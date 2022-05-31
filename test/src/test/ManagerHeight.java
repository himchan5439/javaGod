package test;

public class ManagerHeight {
	
	int[][] gradeHeights = new int[5][5];

	public static void main(String[] args) {
		ManagerHeight manager = new ManagerHeight();
		
		manager.getData();
		
//		manager.printHeight();

//		manager.printAverage(4);
		
		int i = 0;
		while(i < 5){
			manager.printAverage(i);
			i++;
		}
	}
	
	public void getData() {
		gradeHeights = new int[5][];
		gradeHeights[0] = new int[] { 170, 180, 173, 175, 177 };
		gradeHeights[1] = new int[] { 160, 165, 167, 186 };
		gradeHeights[2] = new int[] { 158, 177, 187, 176 };
		gradeHeights[3] = new int[] { 173, 182, 181 };
		gradeHeights[4] = new int[] { 170, 180, 165, 177, 172 };
	}
	private void printHeight() {
		for(int i = 0; i < 5 ; i++) {
			System.out.println("Class No.: " + (i+1));
			for(int y = 0; y < gradeHeights[i].length; y++) {
				System.out.println(gradeHeights[i][y]);
			}			
		}
	}
	private void printAverage(int classNo) {
		int i = gradeHeights[classNo].length;
		double sum = 0;
		for(int x = 0; x < i; x++) {
			sum = sum + gradeHeights[classNo][x];
		}
		sum = sum/i;
		System.out.println("Class No.: "+(classNo+1));
		System.out.println("Height average:"+sum);
	}
}