package Shstep1;

// 클래스 변수, 지역 변수
public class ClassTest03_2 {
	
	static int num1;	// 클래스(static)변수
	int num2;			// 인스턴스(non-static)변수
	
	public static void main(String[] args) {
		ClassTest03_2 t1 = new ClassTest03_2();
		System.out.println("클래스 변수 : "+num1);
		
		int num1 = 10;
		
		System.out.println("지역 변수 : " + num1);
		System.out.println("클래스 변수 :" + t1.num1);
	}

}
