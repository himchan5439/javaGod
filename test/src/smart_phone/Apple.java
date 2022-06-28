package smart_phone;

public class Apple extends Phone{
	
	public Apple() {
		super("애플-아이폰13", 2, "아이폰13", "애플", "130만원");
		
		if(num == 10) {
			Siri();
		}
	}
	
	public void Siri(){
		System.out.print("검색단어 > ");
		
		String in = sc.next();
		
		System.out.println("\n결과 = >"+in+"은 "+in.length()+"글자 입니다.");
		System.out.println("검색을 더 하시겠습니까?");
		System.out.print(" > ");
		in = sc.next();
		
		if(in.equals("네")) {
			Siri();
		}
		num = 0;
		System.out.println("\n==============================\n");
		MainMenu();
	}
}
