package Shstep1;

public class ClassTest03 {
	
	// 클래스 , 인스턴스 변수는 초기화를 하지 않아도 사용가능하다.
	static int num1; // 클래스(static)변수
	int num2; // 인스턴스(non-static)변수
	
	public static void main(String[] args) {
		
		// 0. 인스턴스화 시키기
		ClassTest03 c1 = new ClassTest03();
		
		// 1. 클래스 변수
		System.out.println("클래스 변수 :" +num1);
		System.out.println("클래스 변수 :" +c1.num1);
		System.out.println("클래스 변수 :" +ClassTest03.num1); // 권장
		
		// 2. 인스턴스 변수
//		System.out.println("인스턴스 변수 :" +num2); // 오류!!!
//		System.out.println("인스턴스 변수 :" +ClassTest03.num2); // 오류 !!!
		System.out.println("인스턴스 변수 :" +c1.num2);
		
		// 3. 지역 변수
		int num1 = 10;
		System.out.println("지역 변수 :" +num1);
		
		int num2;
//		System.out.println(num2); // 초기화 오류
		
		for(int i=0; i<5; i++) {
			int num3 = 5;
		}
	}
}
