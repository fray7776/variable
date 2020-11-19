package Array;

public class MorningCode {

//5행 5열의 이차원 배열에 넘버링..... 해보자.......
	
	public static void main(String[] args) {
		int[][] intAry = new int[5][5];
		int num = 1;
		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry[i].length; j++) {
				intAry[i][j] = num++;
				System.out.println(intAry[i][j]);

			};
			
			String[] strAry = { "Hello","World" };
			for (String str : strAry) {
				System.out.print(str);
			}

		}
		
		

	}

}
