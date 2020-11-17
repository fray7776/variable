package iteration;

public class Excercise04 {

	public static void main(String[] args) {
		int sum = 0;
		int i1 = 0;
		int i2 = 1;
		boolean run = true;
		while (run) {
			i1 = (int) (Math.random() * 6) + 1;
			i2 = (int) (Math.random() * 6) + 1;
			sum = i1 + i2;
			{
				System.out.println(i1 + "," + i2);
				if (sum == 5)
					break;
			}

		}
	}
}
