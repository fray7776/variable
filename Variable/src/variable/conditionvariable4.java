package variable;

public class conditionvariable4 {

	public static void main(String[] args) {
// 정수형 변수 : num1
//   3의 배수인 경우 > "3의 배수입니다."
//   5의 배수인 경우 > "5의 배수입니다."
//   3의 배수이고 5의 배수인 경우 > "3과 5의 공통 배수입니다."
		int num1 = 9;
		if (num1 % 3 == 0 && num1 % 5 == 0) { // &&앞의 조건도 만족해야 하고 뒤에 조건도 만족해야 하는 논리곱이다.
			System.out.println("3과 5의 배수입니다.");
		} else if (num1 % 5 == 0){ 
            System.out.println("5의 배수입니다.");
        } else if (num1 % 3 == 0) {
            System.out.println("3의 배수입니다.");
        } else {  //위의 조건을 모두 만족하지 못하면 다 else 조건문으로 실행한다.
          System.out.println("기타입니다.");	
        }

	}

}
