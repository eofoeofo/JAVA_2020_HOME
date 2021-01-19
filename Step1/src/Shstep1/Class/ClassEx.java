package Shstep1.Class;

public class ClassEx {
	public static void main(String[] args) {
		hello();
		ClassEx ce = new ClassEx(); 
		ce.hi();
		OtherClass.show01();
//		OtherClass.show02(); // 동적 메소드(static)이 아닌 정적 메소드는 참조 할 수 없다
		
		// non-static(정적 메소드) 호출 방식
		// 인스턴스 접근 = 인스턴스 생성 = 객체 생성
		OtherClass obj = new OtherClass();
		// 클래스명     객체명 = new	클래스명();
		obj.show02();
		
		// 객체화 -> 초기화
		Car c1 = new Car();
		c1.name = "그랜져";
		c1.age = 2020;
		c1.grade = "l";
		c1.move(); // 마지막에 메소드명을 호출 해줘야 해당 메소드가 실행된다.
		System.out.println();
		// 다시 인스턴스
		Car c2 = new Car();
		c2.name = "제네시스G80";
		c2.age = 2020;
		c2.move();
	}
	static void hello() {
		System.out.println("헬로");
	}
	void hi() {
		System.out.println("안녕");
	}

}
