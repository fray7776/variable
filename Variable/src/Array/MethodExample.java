package Array;

public class MethodExample {

	public static void main(String[] args) {
		//두 수를 더해서 2로 나누고 50을 더하고 다시 10으로 나눔
		int num1, num2, result;
		num1 = 34;
		num2 = 55;
		result = sumMethod(num1,num2);
		
		int val1 = 22, val2 = 55;
		result = sumMethod(val1,val2);
		System.out.println(result);
		
		int val3 = 12, val4 = 80;
		result = sumMethod(val3,val4);
		System.out.println(result);

	}
    public static int sumMethod(int numb1, int numb2) { //복잡한 수식을 선언하고 수를 대입해 계산하는 작업
    	int result = numb1 + numb2;
    	result = result /2;
    	result = result +50;
    	result = result /10;
    	return result;   //위의 수식의 결과값을 반환해달라는 말 , 반환해주는 값은 int
    }
}
