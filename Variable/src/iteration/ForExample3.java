package iteration;

public class ForExample3 {

	public static void main(String[] args) {
		//for (int i=0; i<10; i++) {}
		int i = 0; // i값이 조건식을 만족하는 동안 아래 출력을 하겠다.
		while(i < 10) {
			System.out.println("2*" + i + "=" + (2*i));
			i++;
		}

	}

}
