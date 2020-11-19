package variable2;

//이름, 학번, 영어점수, 수학점수를 생성하라.(필드)   
public class Student {
	private String hname;
	private int hnum;
	private double Engnum;
	private double Mathnum;

//메소드 만들기	
	public void sethname(String hname) {
		this.hname = hname;
	}

	public void sethnum(int hnum) {
		this.hnum = hnum;
	}

	public void setEngnum(int Engnum) {
		this.Engnum = Engnum;
	}

	public void setMathnum(int Mathnum) {
		this.Mathnum = Mathnum;
	}

	public void studentInfo() {
		System.out.println("이름: " + hname + " 학번: " + hnum + "입니다.");
	}

	public double totalScore() {
		return Engnum + Mathnum;
	}
}

//public Student(String hname, int hnum, double Engnum, double Mathnum) {
//this.hname = "송혜원";
//this.hnum = 121212;
//this.Engnum = 80;
//this.Mathnum = 70;
//}
