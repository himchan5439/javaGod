package test;

public class Equals {
	public static void main(String[] args) {
		Equals thisObject = new Equals();
		thisObject.equalMethod();
	}
	public void equalMethod() {
		MemberDTO obj1 = new MemberDTO("Sangmin");
		MemberDTO obj2 = new MemberDTO("Sangmin");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1 and obj2 in same");
		} else {
			System.out.println("obj1 ans obj2 in different");
		}
	}
}
