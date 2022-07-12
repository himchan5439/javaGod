package solution;

//import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		System.out.println("   s   |   n   | result|");
		System.out.println("-------|-------|-------|");
		
//		System.out.println(solution("z A", 1));
		
//		Scanner sc = new Scanner(System.in);
		
		System.out.println(" \"AB\"  |   1   |\""+solution("AB", 1)+"\"   |");
		System.out.println(" \"z\"   |   1   | \""+solution("z", 1)+"\"   |");
		System.out.println("\"a B z\"|   4   |\""+solution("a B z", 4)+"\"|");
		
//		String[][] table = new String[3][]; 
		
//		table[0] = new String[] {sc.next(),"",solution("z A", 1)};
//		
//		
//		for (String[] row : table) {
//            System.out.format("%15s | %15s | %n", row);
//        }
		
//		for(char i = 'a'; i <= 'z'; i++) {
//			System.out.println(i);
//		}

	}

	public static String solution(String s, int n) {
		String answer = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ' ') {
				answer = answer + " ";
				continue;
			}
			if (!(c == 'z')) {
				char a = (char) (c + n);
				answer = answer + a;
			} else {
				char a = (char) ((c - 26) + n);
				answer = answer + a;
			}
		}
		return answer;
	}
}
