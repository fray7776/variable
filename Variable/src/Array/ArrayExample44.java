package Array;

public class ArrayExample44 {

	public static void main(String[] args) {
		int[][] intAry = new int[3][3]; // 이차원 배열이라는 의미, [칼럼,행][열]
		intAry[0] = new int[] { 11, 12, 13 };
		intAry[1] = new int[] { 21, 22, 23 };
		intAry[2] = new int[] { 31, 32, 33 };

		System.out.println(intAry[0][0]);

		System.out.println(intAry[0].length); // 크기는 첫번째의 첫번째??

		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry.length; i++) {
				System.out.println("intAry[" + i + "," + j + "] >" + intAry[i][j]);
			}
		}
		int[][] intAry2 = { { 11, 12, 13 }, // 열 3
				{ 21 }, // 열 1
				{ 31, 32 } // 열 2
		};
		System.out.println(intAry2[2].length);
		// intAry2의 배열의 각 합, 평균을 구하는 결과
		// intAry2[0] => 합 : ??, 평균 : ?? 입니다.
		// intAry2[1] => 합 : ??, 평균 : ?? 입니다.
		// intAry2[2] => 합 : ??, 평균 : ?? 입니다.
		int sum = 0;
		for (int i = 0; i < intAry2[i].length; i++) {
			for (int j = 0; j < intAry2[j].length; j++) {
				sum += intAry2[i][j];
			}
			System.out.println("첫번째 배열의 결과값은 " + sum);
		}
	}
}
