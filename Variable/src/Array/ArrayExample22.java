package Array;

public class ArrayExample22 {

	public static void main(String[] args) {
// double[] => 23.2, 55.3, 52.8, 62.8 : dAry (double타입의 배열)
// method: doubleSum(), 매개변수 : double[]
// 반환해주는 값: double
    double[] doubleAry;
    double sum = 0;
    doubleAry = new double[] {23.2, 55.3, 52.8, 62.8};
    for (double i = 0; i <doubleAry.length; i++) {
    	sum += doubleAry[i];
    } { System.out.println("결과값: "+ result);
    }
    
	public static double doubleSum(double[] dAry) {
		double sum = 0;
		for (double num : dAry) {
			sum += num;
		}
		return sum;
	}

}
