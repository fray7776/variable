package variable6;

public class member6 {
	private int memNo;
	private String memName;
	private int memPhone;
	private String className;
	public int getMemNo() {
		return memNo;
		
	}
	
	public member6(int memNo, String memName) {
		super();
		this.memNo = memNo;
		this.memName = memName;
	}

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
		return "member6 [memNo=" + memNo + ", memName=" + memName + ", memPhone=" + memPhone + ", className="
				+ className + "]";
	}

}
