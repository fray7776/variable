package Array;

public class ArrayExample33 {

	public static void main(String[] args) {

		int num1 = 10, num2 = 20, num3 = 30;
		int temp; // 두개의 숫자를 비교해서 큰숫자를 temp에 받는다..(case)

		// 세 변수에 들어 있는 값중 가장 큰 값을 temp에 담기
		if (num1 > num2) {
			if (num1 > num3)
				temp = num1;
			else
				temp = num3;

		} else {
			if (num2 > num3)
				temp = num2;
			else
				temp = num3;
		}
		System.out.println("큰 수는: " + temp);
		//배열에서 중요한 요소 = 반복문(for)
		temp = 0;
		int[] intAry = {34, 25, 57, 39, 55};
		for(int num : intAry) {
			if(temp < num) {
				temp = num;
			}
		}
		System.out.println("큰 수는: " + temp);
	}

}
