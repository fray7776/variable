package variable;

public class OperatorExample {

	public static void main(String[] args) {
		String str = "Hello";
		str = str + "World";
		str = str + "!!!";
		System.out.println(str);

		int num1 = 10;
		num1 = num1 + 5;
		num1 = num1 + 15;
		System.out.println(num1);
	
	    double num2 = 3.4;
	    num2 = num2 * 10;
	    num2 = num2 * 100;
	    System.out.println(num2);
	
	    // ! 는 true값의 반대값을 넣겠다는 의미 (2번 넣으면 원래대로 돌아감)
	    boolean tf = true;
	    tf = !tf;
	    tf = !tf;
	    System.out.println(tf);
	
	
	}

}
