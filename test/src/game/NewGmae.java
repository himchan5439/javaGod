package game;

import java.util.Random;
import java.util.Scanner;

public class NewGmae {

	int strike = 0, ball = 0, out = 0, difficulty = 0, num = 0;

	String[] answer;

	Scanner sc = new Scanner(System.in);
	Random random = new Random();

	private void setAnswer() {
		System.out.print("\n게임 난이도를 선택하시오.(숫자의 갯수를 의미합니다. 최대 : 9): ");
		difficulty = sc.nextInt();
		if (difficulty <= 9 && difficulty >= 1) {
			answer = new String[difficulty];
			for (int i = 0; i < difficulty; i++) {
				answer[i] = String.valueOf(random.nextInt(10));
			}
			for (String i : answer) {
				System.out.println(i);
			}
			check();
		} else {
			System.out.println("올바른 값을 입력해주세요");
			setAnswer();
		}
	}

	private void check() {
		strike = 0;
		ball = 0;
		System.out.print("\n답을 맞춰 보세요(" + difficulty + " 자리수 입니다.): ");
		String in = sc.next();
		if (in.length() == difficulty) {
			num++;
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
			if (0 == strike && 0 == ball) {
				out++;
			}
			System.out.println("결과 :[" + strike + "] 스트라이크 / [" + ball + "] 볼 / [" + out + "] 아웃");
			if (out == 3) {
				System.out.println("\n\n---------------------------------\n");
				System.out.println("3아웃 입니다.");
				System.out.printf("시도 횟수 [ " + num + " ] 번입니다.");
				reGame();
			}
			if (difficulty == strike) {
				System.out.println("\n\n---------------------------------\n");
				System.out.println("축하합니다! 정답입니다!");
				System.out.printf("시도 횟수 [ " + num + " ] 번입니다.");
				reGame();
			}
		} else {
			System.out.println("올바른 값을 넣어주세요");
			check();
		}
		check();
	}

	private void reGame() {
		System.out.println("\n\n게임을 다시 하시겠습니까? [ 네 / 아니요]");
		String s = sc.next();
		if (s.equals("아니요")) {
			System.out.println("게임을 종료합니다");
			System.exit(0);
		} else if (s.equals("네")) {
			System.out.println("게임을 다시 시작합니다\n\n\n\n\n\n\n");
			setAnswer();
		}
	}

	public static void main(String[] args) {
		System.out.println("야구 게임 입니다.");
		new NewGmae().setAnswer();
	}
}
