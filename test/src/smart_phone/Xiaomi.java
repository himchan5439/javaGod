package smart_phone;

public class Xiaomi extends Phone{
	
	public Xiaomi() {
		super("샤오미-홍미노트11", 3, "홍미노트11", "샤오미", "30만원");
		
		if(num == 10) {
			HeyGoogle();
		}
	}
	
	public void HeyGoogle() {
		System.out.print("검색단어 > ");
		
		String in = sc.next();
		
		System.out.println("\n결과 = >"+in+"은 "+in.length()+"글자 입니다.");
		System.out.println("검색을 더 하시겠습니까?");
		System.out.print(" > ");
		in = sc.next();
		
		if(in.equals("네")) {
			HeyGoogle();
		}
		num = 0;
		System.out.println("\n==============================\n");
		MainMenu();
	}
}
