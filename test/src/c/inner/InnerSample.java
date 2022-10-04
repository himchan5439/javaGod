package c.inner;

public class InnerSample {
	public static void main(String[] args) {
		
	}
	public void makeInnerObject() {
		OuterOfInner outer = new OuterOfInner();
		OuterOfInner.Inner inner = outer.new Inner();
		inner.setValue(3);
	}
}
