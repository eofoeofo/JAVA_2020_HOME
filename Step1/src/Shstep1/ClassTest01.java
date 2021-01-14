package Shstep1;

//변수,메서드 명은 '소문자'로 시작
//클래스명은 '대문자'로 시작
//클래스를 데이터 타입이라고 생각하면된다. (설계도)

//클래스의 구성요소 : 변수(특징), 메소드(기능)

// 추상적인 개념, 설계도, 초기화 X
//  new를 사용하여 선언 해야지만 메모리 공간을 차지 하고, 이전에는 차지 하지 않는다.
class Person {
	//변수 : 특징 (정적인 단어)
	int age;
	String name;
	String gender;
	double height;
	long jumin;
	
	//메소드: 기능 (동적인 단어)
}

public class ClassTest01 {
	public static void main(String[] args) {
		Person hgd = new Person();
		// 클래스의 주소값
		System.out.println(hgd);
		
		// 초기화
		hgd.age = 14;
		hgd.name = "홍길동";
		hgd.height = 158.6;
		hgd.jumin = 293293L;
		
		System.out.println("이름 :"+hgd.name);
		System.out.println("나이 :"+hgd.age);
		System.out.println("키 :"+hgd.height);
		System.out.println("주민번호 :"+hgd.jumin);
	}
}
