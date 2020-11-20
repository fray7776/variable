package variable5;

public class Member {
	private int memNo;
	private String memName;
	private int memPhone;
	private String className;
	
	public Member() { //매개값이 아무것도 없는 것 > 기본 생성자
		
	}
	
	public Member(int memNo, String memName) {
		this.memNo = memNo;
		this.memName = memName;
	}

	public Member(int memNo, String memName, int memPhone, String className) {
		this.memNo = memNo;
		this.memName = memName;
		this.memPhone = memPhone;
		this.className = className;
	}
	
	public int getMemNo() {
		return memNo;
	}
	public String getMemName() {
		return memName;
	}
	public int getMemPhone() {
		return memPhone;
	}
	public String getClassName() {
		return className;
	}

}
