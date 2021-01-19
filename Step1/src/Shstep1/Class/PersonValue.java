package Shstep1.Class;

import java.util.Scanner;

public class PersonValue {
	private int age;
	private String name;
	Scanner sc;
	
	public PersonValue() {
		sc = new Scanner(System.in);
	}
	
	public void setInfo() {
		System.out.println("이름 :");
		name = sc.nextLine();
		System.out.println("나이 :");
		age = sc.nextInt();
	}

}
