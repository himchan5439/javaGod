package test;

import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		int difficulty = 0, num = 0, out = 0;
		String in;

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		System.out.println("야구 게임 입니다.");
		while (true) {
			System.out.print("\n게임 난이도를 선택하시오.(숫자의 갯수를 의미 합니다. 최대:9): ");
			difficulty = sc.nextInt();
			if (difficulty <= 9 && difficulty >= 1) {
				break;
			} else {
				System.out.println("올바른 값을 입력해주세요");
			}
		}

		String[] answer = new String[difficulty];

		for (int i = 0; i < difficulty; i++) {
			answer[i] = String.valueOf(random.nextInt(10));
		}

//		for(int i = 0; i < difficulty; i++) {
//			System.out.println(answer[i]);
//		}

//		System.out.println("test : ");
//		String test = sc.nextLine();
//		
//		System.out.println("1번" + test.substring(0,1));	

		while (true) {
			int strike = 0, ball = 0;
			num++;
			if (out < 3) {
				while (true) {
					System.out.print("\n답을 마춰 보세요 (" + difficulty + " 자리수 입니다.): ");
					in = sc.next();
					if (in.length() == answer.length) {
						break;
					} else {
						System.out.println("올바른 길이의 값을 넣어주세요");
					}
				}
				for (int i = 0; i < difficulty; i++) {
					String temp = in.substring(i, i + 1);
					if (temp.equals(answer[i])) {
						// 스트라이크
						strike++;
					} else {
						for (int y = 0; y < difficulty; y++) {
							if (temp.equals(answer[y])) {
								// 볼
								ball++;
							}
						}
					}
				}
				if (strike == 0 && ball == 0) {
					out++;
				}
				System.out.println("결과 :[" + strike + "] 스트라이크 / [" + ball + "] 볼 / [" + out + "] 아웃");
			} else {
				System.out.println("3아웃 입니다");
				break;
			}

			if (strike == difficulty) {
				System.out.println("\n\n---------------------------------\n");
				System.out.println("축하합니다! 정답입니다!");
				System.out.println("시도 횟수 [" + num + "] 번 입니다.");

				break;
			}
		}
		System.out.println("\n게임을 다시 하시겠습니까? [ 네 / 아니요 ]");
		in = sc.next();
		if (in.equals("네")) {
			main(null);
		} else if (in.equals("아니요")) {
			System.out.println("게임을 종료합니다");
		} else {
			System.out.println("올바른 값을 입력해주세요");
		}
	}
}