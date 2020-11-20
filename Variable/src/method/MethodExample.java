package method;

public class MethodExample {
	public static void main(String[] args) {
		Math m1 = new Math();
		int sum = m1.sum(10,20);
		double sum1 = m1.sum1(10.5,10.2);
		System.out.println("결과: "+sum1);
		double area = m1.getArea(5.5); // pi * r* r
		System.out.println("넚이: " + area);
		//정사각형 넓이: getRectangle(메소드이름), 매개변수: 4.2
		double e = m1.getRectangle(4.2);
		System.out.println("넓이: " + e);
		double a= m1.getRectangle(4.2,2.4);
		System.out.println("넓이: " + a);
		//직사각형 넓이 : getRectangle, 매개변수:4.2,2.4
		
		int m = m1.getArySum(new int[] {10,15,16,17});
		System.out.println("배열합1이.. 궁금하니??" + m);
		
		Person happy = new Person("이창호",10,135.5,32.5);
		double d1 = m1.getProperWeight(happy);
		if(happy.weight >d1) {
			System.out.println("체중과다야...");
		}else if(happy.weight == d1) {
			System.out.println("적정체중이다...");
		}else {
			System.out.println("체중미달이야...");
		}


	}

}
                                                                                                                                                                                                                                                                                                                                                                                    