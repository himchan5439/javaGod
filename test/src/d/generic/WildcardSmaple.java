package d.generic;

public class WildcardSmaple {
	public static void main(String[] args) {
		WildcardSmaple sample = new WildcardSmaple();
		sample.callWildcardMethod();
	}

	public void callWildcardMethod() {
		WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
		wildcard.setWildcard("A");
		wildcardStringMethod(wildcard);
	}

	public void wildcardStringMethod(WildcardGeneric<?> c) {
		Object value = c.getWildcard();
		if (value instanceof String) {
			System.out.println(value);
		}
	}
}
