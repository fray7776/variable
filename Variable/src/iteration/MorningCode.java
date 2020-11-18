package iteration;

public class MorningCode {
// 1~50의 정수중 7의 배수는 sum7에 8의 배수는 sum8에 더하시오
	public static void main(String[] args) {
		int sum7 = 0;
		int sum8 = 0;

		for (int i = 1; i <= 50; i++) {
			if (i % 7 == 0) {
				sum7 += i;

			System.out.println("7의 배수는" + sum7);
			{
				if (i % 8 == 0)
					sum8 += i;
				System.out.println("8의 배수는" + sum8);
			}
		}

	}
}