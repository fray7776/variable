package variable;

public class Operatorexample1 {
	// str +는 누적시켜서 값을 도출
	public static void main(String[] args) {
		String str = "Hello";
		str += str + "World";
		System.out.println(str);

		int num1 = 10;
		num1 += 5;
		num1 -= 3; // 12
		num1 *= 5; // 60
		num1 /= 6; // 10
		System.out.println("num1: " + num1);

		int num2 = 10;
		num2++; // ++ '1'을 증가시키라는 의미
		num2--; // -- '-1'을 빼라는 의미
		num2--; // 9
		System.out.println("num2: " + num2);

		int num3 = 10;
		num3 -= 5;
		num3 -= 5;
		num3 -= 5;
		num3 += 20;

		if (num3 > 0) {
			System.out.println("num3은 0보다 큽니다.");
		} else if (num3 < 0) {
			System.out.println("num3은 0보다 작습니다.");
		} else {
			System.out.println("num3은 0입니다.");
		}
	
	
	int num4 = 30;
	num4 /= 2;
	num4 /= 2;

//	if(num4%2==0)
//	{
//		System.out.println("num4는 짝수입니다.");
//	}else
//	{
//		System.out.println("num4는 홀수입니다.");
//  }
	boolean result = true;
//  result = (num4 % 2) == 0 ? ture : false; //num4를 2로 나는 나머지를 '0(짝수)' 짝수이면 true 홀수면 false
	int result1 = (num4 % 2) == 0 ? 0 : 1; 
//  문자로 받고 싶으면 int를 string으로 바꾸면 된다.	
    System.out.println(result1);
}   
}