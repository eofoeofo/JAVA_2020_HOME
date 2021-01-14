package Shstep1;

public class ClassTest05 {
	// 비 void는 리턴X
	//   void는 리턴O
	
	// 클래스 메소드
	static int sum() {
		return 10 + 5;
	}
	static void getInfo() {
		System.out.println("리턴 타입X 클래스 메소드");
	}
	
	// 인스턴스 메소드
	int multiply() {
		return 10 * 3;
	}
	
	void getName() {
		System.out.println("홍길동");
	}
	
	public static void main(String[] args) {
		
		// 1. 클래스 메소드
		System.out.println(ClassTest05.sum());
		
		int num1 = ClassTest05.sum();
		System.out.println(num1);
		
		ClassTest05.getInfo();
		
		// 2. 인스턴스 메소드
		ClassTest05 c1 = new ClassTest05();
		
		System.out.println(c1.multiply());
		c1.getName();
	}
	

}
