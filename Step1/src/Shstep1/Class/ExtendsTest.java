package Shstep1.Class;

class Person {
	String name;
	int age;
	
	void love() {
		System.out.println("사랑");
	}
}

class friend extends Person {
	@Override
	void love() {
		System.out.println("우정");
	}
}

class Employee extends Person {
	@Override
	void love() {
		System.out.println("동료애");
	}
}

class Teacher extends friend {
	@Override
	void love() {
		System.out.println("훈육");
	}
}
public class ExtendsTest {
	public static void main(String[] args) {
		friend fr = new friend();
		fr.love();
		Teacher tc = new Teacher();
		tc.love();
	}
}
