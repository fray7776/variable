package Array;

public class ArrayExample2 {

	public static void main(String[] args) {
		int[] intAry = new int[5]; // int의 자릿수 설정
		intAry[0] = 15; // 출력값의 첫번째
		intAry[4] = 33; // 출력값의 세번째, 기본값은 0이 된다. 그래서 2,3번째는 0으로 출력됨
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
		}
		double[] doubleAry; // 크기를 지정안하면 값이 할당이 안되었기 때문에 null값으로 출력
		doubleAry = new double[] { 2.3, 2, 4.5, 2.2, 1.6 }; // double[] doubleAry{2.3, 2,..}쓸수 있다.(한라인에 적을때)
		System.out.println(doubleAry[0]);
		double sum = 0;
		for (int i = 0; i < doubleAry.length; i++) { // doubleAry.length는 배열의 크기만큼이라는 뜻
			sum += doubleAry[i];
		}
		System.out.println("sum = " + sum);

		// enhanced for > 배열의 크기만큼 출력 자릿수만큼!
		sum = 0;
		for (double db1 : doubleAry) { //doubleAry의 갯수만큼만 반복하겠다는 의미
			sum += db1;
			System.out.println(db1);  
		}
		System.out.println("sum= " + sum);
	}
}