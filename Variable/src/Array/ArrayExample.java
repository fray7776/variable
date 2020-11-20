package Array;

public class ArrayExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;

		int[] numbers = { 10, 20, 30, 40, 50 }; // int[]는 int형 타입의 변수를 여러개 담을 수 있다.
		numbers[1] = 200; // 두번째 값에 200을 넣는다. 두번째 값이 20에서 200으로 된다.
		System.out.println(numbers[2]); // number값의 첫번째 값을 가져오시오 > 0은 첫번째 위치값 = 10
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println(numbers[i]);
			sum += numbers[i];
		}
		System.out.println("합: " + sum);

		String[] strings = { "Hello", "World", "Nice", "To", "Meet", "You" };
		strings[2] = "Good";
		for (int i = 0; i < strings.length; i++) { // string.length > string의 속성
			System.out.println(strings[i]);

		}
	}

}
