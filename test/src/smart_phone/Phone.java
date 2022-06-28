package smart_phone;

import java.util.Scanner;

public class Phone {
	
	Scanner sc = new Scanner(System.in);
		
	String phoneName, maker, name, price;
	boolean power = false;
	int phoneNum, num;
	
	Phone(String phoneName, int num, String maker, String name, String price){
		this.phoneName = phoneName;
		this.phoneNum = num;

		this.maker = maker;
		this.name = name;
		this.price = price;
		
		MainMenu();
	}
	
	void MainMenu(){
		System.out.println("[메뉴 ("+ phoneName +")]");
		System.out.println("1) 기기정보");
		System.out.println("2) 전원ON");
		System.out.println("3) 전원OFF");
		if(phoneNum == 1) {
			System.out.println("4) 빅스비");
		} else if(phoneNum == 2) {
			System.out.println("4) 시리");
		} else if(phoneNum == 3) {
			System.out.println("4) 헤이구글");
		}
		System.out.println("5) 전화걸기");
		Scan();
	}
	
	void Scan() {
		System.out.print("선택 > ");
		
		num = sc.nextInt();
		
		if(num == 2) {
			System.out.println("[핸드폰 전원이 켜졌습니다.]");
			System.out.println("\n==============================\n");
			power = true;			
			MainMenu();
		}
		
		if(power) {
			if(num == 3) {
				System.out.println("[핸드폰 전원이 꺼졌습니다.]");
				System.out.println("\n==============================\n");
				power = false;			
				MainMenu();
			} else if(num == 1) {
				System.out.println("\n==============================\n");
				InfoMenu(); 
			}else if(num == 4) {
				System.out.println("\n==============================\n");
				SelectMenu();
			}else if(num == 5) {
				System.out.println("\n==============================\n");
				Call();
			}
		}else{
			System.out.println("\n[전원이 꺼진 상태로는 모든 기능이 사용 불가합니다]");
			System.out.println("\n==============================\n");
			MainMenu();
		}
	}
	
	void Scan(int no) {
		System.out.print("선택 > ");
		
		num = sc.nextInt();
		
		if(no == 1) {
			if(num == 1) {
				PhoneInfo();
			}else if(num == 2) {
				PhonePermute();
			}
		}else if(no == 4&& num == 1) {
			num = 10;
		}
	}
	
	void Scan(int no1, int no2) {
		System.out.print("선택 > ");
		
		num = sc.nextInt();
		
		if(no1 == 1) {
			if(num == 1) {
				System.out.println("[애플 아이폰13이 선택되었습니다]");
				System.out.println("\n==============================\n");
				new Apple();
			}else if(num == 2) {
				System.out.println("[삼성 겔럭시S22가 선택되었습니다]");	
				System.out.println("\n==============================\n");
				new Samsung();
			}else if(num == 3) {
				System.out.println("[샤오미 홍미노트11이 선택되었습니다]");
				System.out.println("\n==============================\n");
				new Xiaomi();
			}
		}
	}
	
	void InfoMenu(){
		System.out.println("[메뉴 ("+ phoneName +")]");
		System.out.println("1) 기기정보");
		System.out.println("2) 기기변경");
		
		Scan(1);
	}
	
	void PhoneInfo(){
		System.out.println("\n::::"+ phoneName +"::::");
		System.out.println("제조사 : "+maker);
		System.out.println("모델명 : "+name);
		System.out.println("가격 : "+price);
		
		System.out.println("\n==============================\n");
		MainMenu();
	}
	
	void PhonePermute(){
		System.out.println("\n1-애플");
		System.out.println("2-삼성");
		System.out.println("3-샤오미");
		
		Scan(1,1);
	}
	
	void SelectMenu() {
		System.out.println("\n[메뉴 ("+ phoneName +")]");
		System.out.println("1) 검색");
		Scan(4);
	}
	
	void Call() {
		int number;
		String name;
		
		System.out.print("전화번호 > ");
		number = sc.nextInt();
		System.out.print("이름 > ");
		name = sc.next();
		
		System.out.println("[전화 거는중]");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("[상대방이 전화를 받지 않습니다.]");
		System.out.println("\n==============================\n");
		MainMenu();
	}
	
}
