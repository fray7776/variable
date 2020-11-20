package variable3;

import variable2.Student;

public class MemberExample {
	public static void main(String[] args) {
		
		Member m1 = new Member();
		m1.memNo=1;
		m1.memName="송혜원";
		m1.memPhone=010-2558-0331;
		m1.className="수영";
		
		m1.showMemberInfo();
		
		Member m2 = new Member();
		m2.memNo=2;
		m2.memName="추근영";
		m2.memPhone=010-1234-2456;
		m2.className="요가";
		
		m2.showMemberInfo();
		
		Member[] Members = {m1,m2};
		
	}

}
