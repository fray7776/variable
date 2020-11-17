package iteration;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); //사용자가 입력한대로 결과가 반환된다. scn=변수
		System.out.println("숫자만 입력.");
		int result = scn.nextInt(); //문자 or 숫자를 문자 형태로 바꾸어 준다.  
		                            //nextInt는 숫자만 반환!, 사용자가 입력할 때까지 기다리고있음....

		System.out.println("입력값: " +result);
	}

}
