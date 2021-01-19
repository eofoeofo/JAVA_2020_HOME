package Shstep1.Class;

public class Student {
	private String name;
	private int id;
	private int age;
	private int score;
	
	// 비 보이드 = 리턴 O
	public String getName() {
		return name;
	}
	// 보이드 = 리턴 X
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		if(0 <= score && score <=100) {
			this.score = score;
		} else {
			System.out.println("0~100점 사이의 점수를 입력");
		}
	}
}
