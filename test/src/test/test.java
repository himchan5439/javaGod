package test;

public class test {
	
	String name,age;
	
	private void setName(String str) {
		name = str;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	private void printAge() {
		System.out.println("My age is " + age);
	}

	private void printName() {
		System.out.println("My name is " + name);
	}
	
	public static void main(String[] args) {
		test t = new test();
		
		t.setName("Min");
		t.setAge("20");
	
		t.printName();
		t.printAge();
	}
}
