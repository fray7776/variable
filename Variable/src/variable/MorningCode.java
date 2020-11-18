package variable;

public class MorningCode {

	public static void main(String[] args) {
		// 정수형 배열 변수 intNumbers
		// 요소: 23,56,34,65,28,21
		// 홀수값의 합 : sum 변수에 저장하고 출력

		int[] numbers = { 23, 56, 34, 65, 28, 21 };
		int sum = 0;
		for (int i = 0; i <= 5; i++) {
			if (numbers[i] % 2 == 1) {
				sum += numbers[i];
			}

		}
		System.out.println("홀수의 합은 " + sum);

	}
}