package variable4;

public class Memberexample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setMemNo(1);
		m1.setMemName("송혜원");
		m1.setMemPhone(25580331);
		m1.setClassName("수영");
		
		System.out.println(m1.getMemNo());
		System.out.println(m1.getMemName());
		
		System.out.println(m1.toString());
	}

}
