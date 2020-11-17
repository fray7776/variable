package iteration;

public class MorningCode {
// 1~50의 정수중 7의 배수는 sum7에 8의 배수는 sum8에 더하시오
	public static void main(String[] args) {
		int sum7 = 7;
		int sum8 = 8;
		for (int i = 7; i <= 50; i++)
			if (sum7 % 7 == 0) {
				sum7 += i;
				System.out.println(sum7 +=i);

			} else if (sum8 % 8 == 0) {
				sum8 += i;
				System.out.println();
			}

	}
}
