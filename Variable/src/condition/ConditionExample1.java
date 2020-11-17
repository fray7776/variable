package condition;

public class ConditionExample1 {

	public static void main(String[] args) {
		int score = 50;
		String grade = "";
		
		if (score >= 90) {
			grade = "A";
		}
		if (score >= 80) {
			grade = "B";
			if (score >= 70) {
				grade = "C";
			}
			if (score >= 60) {
				grade = "D";

			}
			if (score <= 60) {
				grade = "F";
			}
			
		}System.out.println(grade + "입니다.");
	}
}
//70점 이상 C, 60점 이상 D, 60점 미만 F

//		int score1 = 60;
//		String grade2 = "";

//		if (score1 > 70) {
//			grade2 = "C";
//		}
//		if (score1 > 60) {
//			grade2 = "D";

//		}
//		if (score1 < 60) {
//			grade2 = "F"}
//			System.out.println(score1 + "점은 " + grade2 + " 입니다.");
