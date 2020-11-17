package condition;

public class conditionExample {

	public static void main(String[] args) {
		int score = 60;
		String grade = "";

		if (score >= 90) { // if 구문만에 또다른 if를 만들어 조건을 줄 수 있다.
			if (score >= 95) {
				grade = "A+";
			} else // else를 넣지 않으면 결과값이 A가 나온다. 왜냐면 A+를 실행하더라도 2번째에 A가 있으니..
				grade = "A";
		} else if (score >= 80) {
			if (score >= 85) {
				grade = "B+";
			} else
				grade = "B";
		} else if (score >= 70) {
			if (score >= 75) {
				grade = "C+";
			} else
				grade = "C";
		} else if (score >= 60) {
			if (score >= 65) {
				grade = "D+";
			} else
				grade = "D";

		} else if (score < 60) {
			if (score <= 65) {
				grade = "F+";
			} else
				grade = "F";
		}
		System.out.println(score + "점은 " + grade + " 입니다.");
	}

}
