package c.string;

public class StringCheck {
	public static void main(String[] args) {
		StringCheck sample = new StringCheck();

		String addresses[] = new String[] { "����� ���α� �ŵ�����", "��⵵ ������ �д籸 ���ڵ� ���� ����", "����� ���α� ������" };
		
		sample.internCheck();
	}

	private void checkAddresse(String[] addresses) {
		int startCount = 0, endCount = 0;

		String startText = "�����";
		String endText = "��";
		for (String address : addresses) {
			if (address.startsWith(startText)) {
				startCount++;
			}
			if (address.endsWith(endText)) {
				endCount++;
			}
		}
		System.out.println("Starts with " + startText + " count is " + startCount);
		System.out.println("Ends with " + endText + " count is " + endCount);
	}

	private void containCountsAddress(String[] addresses) {
		int containCount = 0;
		String containText = "����";
		for (String address : addresses) {
			if (address.contains(containText)) {
				containCount++;
			}
		}
		System.out.println("Contains " + containText + " count is " + containCount);
	}

	private void checkMatch() {
		String text = "This is a text";
		String compare1 = "is";
		String compare2 = "this";

		System.out.println(text.regionMatches(2, compare1, 0, 1));
		System.out.println(text.regionMatches(5, compare1, 0, 2));
		System.out.println(text.regionMatches(true, 2, compare1, 0, 4));
	}

	private void checkIndexOf() {
		String text = "Java technology is both a programming language and a platform.";

		System.out.println(text.indexOf('a'));
		System.out.println(text.indexOf("a "));
		System.out.println(text.indexOf('a', 20));
		System.out.println(text.indexOf("a ", 20));
		System.out.println(text.indexOf('z'));
	}

	private void checkLastIndexOf() {
		String text = "Java technology is both a programming language and a platform.";

		System.out.println(text.lastIndexOf('a'));
		System.out.println(text.lastIndexOf("a "));
		System.out.println(text.lastIndexOf('a', 20));
		System.out.println(text.lastIndexOf("a ", 20));
		System.out.println(text.lastIndexOf('z'));
	}
	
	public void checkSubstring(){
		String text = "java technology";
		String technology = text.substring(5);
		System.out.println(technology);
		
		String tech = text.substring(5, 9);
		System.out.println(tech);
	}
	
	public void checkSplit() {
		String text = "Java technology is both a programming languge and a platform.";
		String[] splitArray = text.split(" ");
		for(String temp:splitArray) {
			System.out.println(temp);
		}
	}
	
	public void checkTrim() {
		String strings[] = new String[] {
			" a", " b ", "    c", "d   ", "e  ", "  f  ", "       "	
		};
		
		for(String string:strings) {
			System.out.println("[" + string + "] ");
			System.out.println("[" + string.trim() + "] ");
		}
	}
	
	public void checkReplace() {
		String text = "The String class represents character strings.";
		System.out.println(text.replace('s', 'z'));
		System.out.println(text);
		System.out.println(text.replace("tring", "trike"));
		System.out.println(text.replaceAll(" ", "|"));
		System.out.println(text.replaceFirst(" ", "|"));
	}
	
	public void checkFormat() {
		String text = "�� �̸��� %s�Դϴ�. ���ݱ��� %d ���� å�� ���, "
				+ "�Ϸ翡 %f %%�� �ð��� å�� ���µ� �Ҿ��ϰ� �ֽ��ϴ�";
		String realText = String.format(text, "�̻��", 7, 10.5);
//		String realText = String.format(text, "�̻��", 7);
		System.out.println(realText);
	}
	
	public void internCheck() {
		String text1 = "Java Basic";
		String text2 = "Java Basic";
		String text3 = new String("Java Basic");
		text3 = text3.intern();
		System.out.println(text1 == text2);
		System.out.println(text1 == text3);
		System.out.println(text1.equals(text3));
	}

}
