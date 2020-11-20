package variable5;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		System.out.println("이름: " + m1.getMemName());
		Member m2 = new Member(1,"Hong",12345678,"수영");
		System.out.println(m2.getMemName());
		Member m3 = new Member(2,"Michael");
		System.out.println(m3.getMemName());
	}

}
