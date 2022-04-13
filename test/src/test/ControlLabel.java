package test;

public class ControlLabel {

	public static void main(String[] args) {
		ControlLabel control = new ControlLabel();
		
		control.printTimesTable();
	}

	private void printTimesTable() {
		startLabel:
		for(int level = 2; level<=9; level++) {
			for(int unit = 1; unit<=9; unit++) {
				if(unit == 4) {
					continue startLabel;
				}
				System.out.println(level+"X"+unit+"="+level*unit);
			}
		}
	}
}
