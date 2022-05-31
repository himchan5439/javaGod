package test;

public class ParentArg {
	public ParentArg(String name) {
		System.out.println("ParentArg("+name+") Constructor");
	}
//	public ParentArg(InheritancePrint obj) {
//		System.out.println("ParentArg(Inher");
//	}
	public void printName() {
		System.out.println("printName() - ParentArg");
	}
}
