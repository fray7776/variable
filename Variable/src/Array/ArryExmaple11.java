package Array;

public class ArryExmaple11 {

	public static void main(String[] args) {
		int[] intAry;
		int sum = 0;
		intAry = new int[] { 34, 66, 82 };
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
		}
		System.out.println("결과값1: " + sum);
		
		sum = sumAry(intAry);
		System.out.println("결과값2: " + sum);
		
		int[] intAry2 = {11,22,33,44,55,66,77};
		
		sum = sumAry(intAry2);
		System.out.println("결과값3: " + sum);
		
		
	}

	public static int sumAry(int[] ary) {
		int sum = 0;
		for (int num : ary) {
			sum += num;
		}
		return sum;

	}
}
