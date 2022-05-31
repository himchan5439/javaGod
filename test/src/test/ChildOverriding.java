package test;

public class ChildOverriding extends ParentOverriding{
	public ChildOverriding() {
		System.out.println("ChildOverrding Constructor");
	}
	public void printName() {
		System.out.println("ChildOverriding printName()");
	}
}
