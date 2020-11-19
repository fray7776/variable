package variable2;

//필드:뼈대  메소드:각각의 개성

public class Person { 
	private String name;
	private int age;
	private double height;
	private double weight;
	
    //생성자: 필드의 초기값 지정. 특징 : 반환타입이없음(void,..)
	
	//초기화 방법 1.(값을 지정)
	public Person() {
		this.name = "초기이름";
		this.age = 10;
		this.height = 175.2;
		this.weight = 40.5;
		
	}
	
	//초기화 방법 2.(아래와 같은 매개변수 이용해 생성자에 바로 호출)
	public Person(String name,int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
    
	public void showInfo() {
		System.out.println("이름: " + name + " 나이: " + age + " 키: "+ height); //필드의 name을 말함
	}
	//필드에 값을 저장, 불러오는 기능.
	public void setName(String name) {
		this.name = name; //this는 클래스의 필드, 메소드를 활용해 필드값 변경 가능
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public double getHeight() {
		return this.height;
	}
	
	
	public void setAge(int age) {
		if (age > 0)
			this.age = age;
	  else 
		this.age = 0;
	}
	public void setHeight(double height) {
		if (height > 0)
			this.height = height;
		
		else
			this.height = 0;
	}
} 
