package iteration;

import java.util.Scanner;

public class ScannerExamplePratice {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int balance = 0; // 예금이나 출금한 금액이 계속 쌓임

		while (run) { // 종료문구가 들어오지 않는한 계속 돌아가겠다...
			System.out.println("---------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("---------------------");
			System.out.print("선택> ");
			int menu = scn.nextInt();
			if (menu == 1) { 
                System.out.println("예금액> ");
                balance += scn.nextInt();
			} else if (menu == 2) {
                System.out.println("출금액> ");
                balance -= scn.nextInt();
			} else if (menu == 3) {
                System.out.println("잔고> "+balance);
			} else if (menu == 4) {
              run = false; //run이 true일 동안만 반복하라.
			}
			System.out.println(menu + "를 선택했습니다.");
		} //end of while
		System.out.println("프로그램 종료");
	} //end of main()

} //end of class()
