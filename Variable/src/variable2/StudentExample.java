package variable2;

public class StudentExample {
	public static void main(String[] args) {

//hname은 private이기 떄문에 set으로 접근	
		
		Student s1 = new Student();
		s1.sethname("이나경");
		s1.sethnum(121212);
		s1.setEngnum(80);
		s1.setMathnum(70);
		
	   	s1.studentInfo();
	   	System.out.println(s1.totalScore());
	}

}
