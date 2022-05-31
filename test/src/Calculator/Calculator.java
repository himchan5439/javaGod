package Calculator;

import java.util.Scanner;

public class Calculator {

	// 더하기
	protected int add(int a, int b) {

		return a + b;
	}

	// 빼기
	protected int subtract(int a, int b) {

		return a - b;
	}

	// 곱하기
	protected int multiply(int a, int b) {

		return a * b;
	}

	// 나누기
	protected String divide(double a, double b) {
		String s = String.valueOf(Math.round((a / b) * 100) / 100.0) + " / " + (int) a % b;

		return s;
	}

	protected void inpot() {
		Scanner sc = new Scanner(System.in);

//		System.out.println(subtract(10, 5));
		
		System.out.println("계산기 입니다");
		
//		String[] array = in.split(" ");
//		
//		for(String temp:array) {
//			System.out.print(temp);
//		}
		
		while (true) {
			
			System.out.print("\n계산식을 입력해주세요 :");
//			sc.nextLine();
			String in = sc.nextLine();
						
			if (in.contains("+")) {			
				String[] array = in.split("\\+");
				System.out.println(add(Integer.parseInt(array[0].trim()), Integer.parseInt(array[array.length - 1].trim())));
			} else if (in.contains("-")) {
				String[] array = in.split("\\-");
				System.out.println(subtract(Integer.parseInt(array[0].trim()), Integer.parseInt(array[array.length - 1].trim())));
			} else if (in.contains("*")) {
				String[] array = in.split("\\*");
				System.out.println(multiply(Integer.parseInt(array[0].trim()), Integer.parseInt(array[array.length - 1].trim())));
			} else if (in.contains("/")) {
				String[] array = in.split("\\/");
				System.out.println(divide(Integer.parseInt(array[0].trim()), Integer.parseInt(array[array.length - 1].trim())));
			} else if (in.equals("exit")) {
				System.out.println("\n계산기를 종료합니다");
				break;
			}
		}
	}
}
