package variable;

public class ReferenceExample {

	public static void main(String[] args) {
		String str1 = "Hello";// 주소값(참조타입),str1에는 hello라는 주소값이 담겨져있다.
		String str2 = "Hello";// str2="Hello2" 일때 주소값도 Hello와는 다른 주소값이 담긴다. 
		String str3 = new String("Hello");// 새로운 주소값을 만드는 것 > new String()
		                                  // str1,str2와 값(Hello)은 같지만 주소값은 다르다.
		if (str1.equals (str3)) {
			System.out.println("동일한 값.");
		} else {
			System.out.println("다른 값."); //str3는 값이 Hello이지만 새로운 주소값이기 때문에 다르다고 출력된다.
			                               //equals()는 값을 비교하는 것.
		}

	}
}