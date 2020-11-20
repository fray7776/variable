package variable3;

import variable2.Student;

public class Member {
//필드 생성 
//회원번호: 1,2,3,... / 이름 : 홍길동 / 회원 전화번호 : 010-1234-5678 / 강좌명 : 스포츠댄스,수영
//필드이름 규칙 : 소문자, 두단어일때(두번째단어 대문자)
	public int memNo;
	public String memName;
	public int memPhone;
	public String className;
//변수 이름 m1 만들어 member class의 이름 할당 to exmample

//메소드 : showMemberInfo()
//반환값 : 없음
//매개변수 : 없음
//출력 : 회원번호:2, 회원이름 : 짝궁입니다.
//members의 배열 만들기	 (to example)
	public void showMemberInfo() {
		System.out.println("회원번호 : "+ memNo + ",회원이름: "+memName+"입니다. ");
	}
	
}
