
public class DataTypeExample {

	public static void main(String[] args) {
		byte num1 = 12; // 128은 byte 범위에서 벗어나므로 에러가 뜬다.
		short num2 = 128;
		int num3 = 1000000000;
		long num4 = 1000000000L; // L은 long형 정수라는 것을 알려준다.

		byte val1 = 10;
		num3 = val1; // val1의 byte를 자동으로 int로 변환된다 > promotion
		byte result = (byte) (num1 + val1); // byte로 변환하지 않으면
											// ERROR나는 이유는 num1 + val1을 int형으로 변환되어..>casting
		num1 = 120; // 범위(-128~127)
					// num1++; 증감연산자라 int 타입으로 변하지 않고 byte 타입으로 남는다.
		for (int i = 0; i < 20; i++) {
//			System.out.println(num1++);
		}
		
        char char1 = 565;
        //char1 = 'a'; a는 숫자가 65이다. 문자값을 출력한다.
        for (int i = 0; i < 24; i++)
        System.out.println(char1++);
        
        float floatVal = 4.567F; // float 타입의 실수를 도출할때 숫자끝에 F 붙여야함. 아니면 double 타입임
        double doubleVal = 3.4567;
	}

}
