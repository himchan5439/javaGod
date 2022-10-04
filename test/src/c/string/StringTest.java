package c.string;

public class StringTest {
	public static void main(String[] args) {
		StringTest test = new StringTest();
		
		String text = "The String class reprsents character strings.";
		
//		test.printWords(text);
//		test.findString(text, "string");
//		test.findAnyCaseString(text, "string");
//		test.countChar(text, 's');
		test.printContainWords(text, "ss");
	}
	
	public void printWords(String str) {
		String[] print = str.split(" ");
		
		for(String prints:print) {
			System.out.println(prints);
		}
	}
	
	public void findString(String str, String findStr) {
		System.out.println("string is appeared at " + str.indexOf(findStr));
	}

	public void findAnyCaseString(String str, String findStr) {
		str = str.toLowerCase();
		findStr = findStr.toLowerCase();
		System.out.println("string is appeared at " + str.indexOf(findStr));
	}
	
	public void countChar(String str, char c) {
		char[] a = str.toCharArray();
		int count = 0;
		
		for(char temp:a) {
			if(temp == c) {
				count++;
			}
		}
		
		System.out.println("char '" + c + "' const is " + count);
	}
	
	public void printContainWords(String str, String findStr) {
		String[] strin = str.split(" ");
		
		for (String tempStr : strin) {
			if (tempStr.contains(findStr)) {
				System.out.println(tempStr + " contains " + findStr);
			}
		}
	}
}	
