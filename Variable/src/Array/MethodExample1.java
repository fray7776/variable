package Array;

public class MethodExample1 {

	public static void main(String[] args) {
		showInfo("45");
		int result = showDouble(45);
		System.out.println(result);
		System.out.println("반환값은: " + showDouble(33.2));
		System.out.println(divide1(22.2,10.0));
	}

	public static void showInfo(String name) { // 반환값이 없다.(void), String name을 넣으면 메인에 변수값이 들어감
		System.out.println("안녕하세요. " + name + "입니다."); // 메인 mathod안에서만 출력가능
	}

	public static int showDouble(int num) { // int가 반환주체, showDouble > 입력한 값의 2배를 반환
		return num * 2;
	}

	public static double showDouble(double num) { // 실수형 반환값
		return num * 2;
	}

	// 정수형 변수 2개를 받아서 두 수의 합을 반환해주는 메소드(sum)
	public static int sum(int a, int b) {
		int result = 0;
		result = a + b;
		return result;

	}
	// 정수형 변수 3개를 받아서 세 수의 곱을 반환해주는 메소드(multi)
	public static int multi(int a, int b, int c) {
		int result = 0;
		result = a * b * c;
		return result;	
	}
	//double 2개를 받아서 첫번째 매개변수/ 두번째 매개변수 (divide)
	public static double divide(double a, double b) {
		double result = 0;
		result = a/b;
		return result;
		
	}
	//double 2개를 받아서 큰수/작은수(divide)
	public static double divide1(double c, double d) {
		double result = 0;

	    
	     if(c>d) { 
	    	 result = c/d;
	     }else {
	    	 result = d/c;
	     }
		return result;
	}  
}
