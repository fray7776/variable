package iteration;

public class ForExample1 {

	public static void main(String[] args) {
//for를 사용해서 Hello World를 5번 반복

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
			}

		}
		System.out.println("sum: " + sum);
	}
}