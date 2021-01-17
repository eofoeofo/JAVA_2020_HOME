package Shstep1;

// 클래스 생성
public class Phone {
	// 필드 생성(변수랑 비슷함)
	// 클래스 변수 (static 변수, 공용 변수, 파란색 이탤릭체)
	// 모든 인스턴스가 공통적으로 같은 값율 유지 해야 할 경우에 클래스 변수를 사용
//	static int num1;
	
	// 인스턴스 변수 (non-static 변수, 파란색)
	// 인스턴스마다 각가의 다른 값을 유지 해야할 경우에는 인스턴스 변수를 사용한다
//	int num2;
	String company = "삼성";
	String name;
	String color;
	int memory;
	
	// 생성자		// 자주색 = 예약어 / 파란색 = 문자열,필드 / 갈색 = 변수
	Phone(String name, String color, int memory) {
		this.name = name;
		this.color = color;
		this.memory = memory;
	}
	
	Phone(String name, String color) {
		this(name,color,200);
	}
	
	
	// 메소드 (동작 기능)
	String sendMsg(String str) {
		String result = str;
		String blank = "";
		if("".equals(str)) {
			result = blank;
		}
		return result;
	}

}
