package variable2;

import java.util.Scanner;

public class MorningCode {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("_______________________________________________");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("_______________________________________________");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();
			int[] numbers = { 85, 95, 93 };
			int sum = 0;
			
			if (selectNo == 1) {
				

			} else if (selectNo == 2) {
				
				
			} else if (selectNo == 3) {
				
				
			} else if (selectNo == 4) {
		
			} else if (selectNo == 5) {
				run = false;
			}
		}

		System.out.println("프로그램 종료");
	}

}
