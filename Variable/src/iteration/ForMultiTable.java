package iteration;

public class ForMultiTable {

	public static void main(String[] args) {
		int num = 2;
		for (int num = 2; num<=9; num++) {
			System.out.println("[" + num + "단");
			for (int i = 1; i < 10; i++) {
				System.out.println(num + "*"+ i + "="+ num*i);
			
		}
		for (int i = 1; i < 10; i++) {
			System.out.println(num + "*" + i + "=" + num * i);

		}
		num++;
		for (int i = 1; i < 10; i++) {
			System.out.println(num +"*"+ i + "=" + num* i);
	}
}
}
}