package smart_phone;

public class Samsung extends Phone{
	
	public Samsung() {
		super("삼성-겔럭시S22", 1, "겔럭시S22", "삼성", "100만원");
		
		if(num == 10) {
			Bixby();
		}
		
	}
	
	public void Bixby(){
		System.out.print("검색단어 > ");
		
		String in = sc.next();
		
		System.out.println("\n결과 = >"+in+"은 "+in.length()+"글자 입니다.");
		System.out.println("검색을 더 하시겠습니까?");
		System.out.print(" > ");	
		in = sc.next();
		
		if(in.equals("네")) {
			Bixby();
		}
		num = 0;
		System.out.println("\n==============================\n");
		MainMenu();
	}
}
