
public class WhileMyExample {

	public static void main(String[] args) {
		// 1부터 10까지 합:
		int sum = 0;
		int i = 0;
		while (i <= 10) {
			sum += i;
			i++;
			if (i == 10) {
				break;
			}
		}
		System.out.println(sum);
	}

}
