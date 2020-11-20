package method;

public class Math {

	private double pi = 3.14;

	public int sum(int a, int b) {
		return a + b;
	}

	public double sum1(double a, double b) {
		return a + b;
	}

	public double getArea(double r) {
		return pi * r * r;

	}

	public double getRectangle(double c) {
		return c * c;
	}

	public double getRectangle(double s, double w) {
		return s * w;
	}

//int 배열의 합 구하는 메소드.
	public int getArySum(int[] ary) {
		int sum1 = 0;
		for (int num : ary) {
			sum1 += num;
		}
		return sum1;
	}

//사람의 적정 몸무게 구하는 메소드.(매개변수:Person)
//매개변수의 타입이 다르면 같은 변수이름을 쓸수있다...	
	public double getProperWeight(Person happy) {
		// (키 -100) * 0.9;
		double properWeight = (happy.height - 100) * 0.9;
		return properWeight;
	}

	public double getProperWeight(double height) {
		// (키 -100) * 0.9;
		double properWeight = (height - 100) * 0.9;
		return properWeight;
	}
}