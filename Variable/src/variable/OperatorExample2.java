package variable;

public class OperatorExample2 {

	public static void main(String[] args) {

		int num1 = 3;

		int result = 0;
// num1의 값이 짝수이면 result가 0 홀수이면 result가 1로 출력
// 1) if구문  
		if (num1 % 2 == 0) {
			System.out.println("결과값은 " + result + "입니다.");
		} else {
			result = 1;
			System.out.println("결과값은 " + result + "입니다.");

		}

// 2> ? : 구문
		{
			result = (num1 % 2) == 0 ? 0 : 1;

			System.out.println("결과값은 " + result + "입니다.");

		}

//boolean result = true;
//짝수: true 홀수 :false

		boolean result2 = true;
		String result1 = (num1 % 2) == 0 ? "true" : "false";
		System.out.println(result1);
	}
}