package variable2;

public class VariableExample {
//CLASS 만들기, Person class 연계
	public static void main(String[] args) {
		int num = 10;
		String str= "Hello";
		double db1 = 3.4;
		
		String name = "Hong";
		int age = 10;
		double height = 178.8;
		
		String name1 = "Hwang";
		int age1 = 15;
		double height1 = 188.8;
		
		//person class에서 매개변수를 이용해 생성자에 바로 호출할 수 있다.
		Person p1 = new Person("Michael",20,180,73.8); // type = Person이라는 class p1 = 변수
		System.out.println("p1의 이름: " + p1.getName());
		System.out.println("p1의 이름: " + p1.getAge());
		System.out.println("p1의 이름: " + p1.getHeight());
		
		System.out.println("==================");
//		p1.name = "Hong";
		p1.setName("홍");
		p1.setName("WHAT");
//		p1.age = 10;
//		p1.setAge = (-10);
		p1.setAge(15);
//		p1.height = 178.1;
		p1.setHeight(150);
		p1.showInfo();
		System.out.println("p1의 이름: " + p1.getName());
		System.out.println("p1의 나이: " + p1.getAge());
		System.out.println("p1의 키: " + p1.getHeight());
		
		Person p2 = new Person();
		p2.setName("황");
//		p2.name = "Hwang";
//		p2.age = 15;
//		p2.height = 188.5;
		p2.setAge(10);
		p2.setHeight(160);
		p2.showInfo();
		
		
		Person p3 = new Person();
		p3.setName("송");
//		p3.name = "Song";
//		p3.age = 29;
//		p3.height = 159;
//		p3.weight = 80;
		p3.setAge(30);
		p3.setHeight(160.2);
		p3.showInfo();
		
		//Person에 []를 사용하면 배열! 
		Person[] persons = {p1, p2, p3};
		for(Person per : persons) {
//			per.showInfo 
//			System.out.println(per.name);
//			System.out.println(per.age);
//			System.out.println(per.height);
//			System.out.println();
			
		}
		
//		System.out.println(p1.name + p1.age + p1.height);
//		System.out.println(p3.age);
//		System.out.println(p3.weight);

	}

}
