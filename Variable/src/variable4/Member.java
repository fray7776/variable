package variable4;

public class Member {
	private int memNo;
	private String memName;
	private int memPhone;
	private String className;
	
	public int getMemNo() {
		return memNo;
	} //this를 쓰는 이유는 필드값의 memNo와 변수값의 memNo와 구분하기 위해, 이미 구분이 되있으면 필요x
	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public int getMemPhone() {
		return memPhone;
	}
	public void setMemPhone(int memPhone) {
		this.memPhone = memPhone;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	@Override
	public String toString() {
		return "Member [회원번호" + memNo + ", 회원이름=" + memName + ", 회원연락처=" + memPhone + ", 강좌=" + className
				+ "]";
	}
	
	
	}


