package iteration;

public class ForExample {

	public static void main(String[] args) {
// 반복문 
		int sum = 0;
		for (int i = 1; i <= 5; i++) { // i++는 1씩 증가하겠다는 의미 , i=0이라고 설정하고(초기값), 1증가한 i가
		sum += 10;					 // 1<10이 성립되니까 식을 빠져나와서 sum+=10 으로 출력됨
//HELLO WORLD 5번 출력
			System.out.println("Hello World"+i);
		}

	}
}
