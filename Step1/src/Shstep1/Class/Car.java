package Shstep1.Class;

public class Car {
	// 필드
	String name;
	int age;
	String grade;
	
	void move() {
		System.out.println("치명 : " +name);
		System.out.println("연식 : "+age);
		String g = "high";
		if(grade == "l") {
			g = "low";
		}
		System.out.println("등급 : "+g);
	}
}
