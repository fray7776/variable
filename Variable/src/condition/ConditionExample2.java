package condition;

public class ConditionExample2 {

	public static void main(String[] args) {
		int score = 90;
		//score = score / 10;
		score /= 10;
		String grade = "";
		
		// score가 90이면 case 첫번째, 80이면 두번째로 출력, 정확하게 표기해주어야 한다.
		//switch는 break없으면 case대로 쭉 실행한다. break 구문이 있으면 한번 실행 되면 빠져나온다.
		switch (score) {
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default :
			grade = "F";
		}
		System.out.println((score*10) + "점 입니다.");
	}
	
}
//  아래의 경우에는 case9, case8이면 양호가 나온다. break를 했기때문에 실행되면 빠져나오게 된다.
//       switch (score) {
//      case 9:
//   	case 8:
//     	grade = "양호";
//    	break;
// 