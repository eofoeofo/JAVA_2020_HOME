package Shstep1;

class Test {
	
	static int num1 = 1;
	int num2 = 2;
	
	// 3. 지역 변수
	void test() {
		int num3 = 10;
	}
}

public class ClassTest03_3 {
	
	static int num1; // 클래스(static)변수
	int num2; 		 // 인스턴스(non-static)변수
	
	public static void main(String[] args) {
		
		// 0. 인스턴스화 시키기
		ClassTest03_3 c1 = new ClassTest03_3();
		Test t1 = new Test();
		
		// 1. 클래스 변수
		// 클래스 안에 있는 변수는  클래스 명을 따로 쓰지 않아도 사용 가능하지만
		// 다른 클래스 안에 있는 변수는 반드시 클래스명을 써줘야 한다
		System.out.println("클래스 변수 num1 :" + num1);
		System.out.println("클래스 변수 num1 :" + ClassTest03_3.num1);
		
		System.out.println("클래스 Test 변수 num1 :" + t1.num1);
		System.out.println("클래스 Test 변수 num1 :" + Test.num1);
		
		// 2. 인스턴스 변수
		System.out.println("인스턴스 변수 num2 : "  + c1.num2);
		System.out.println("인스턴스 Test 변수 num2 : " + t1.num2);
		
	}

}
