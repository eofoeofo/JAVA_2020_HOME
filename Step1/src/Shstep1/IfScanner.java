package Shstep1;

import java.util.Scanner;

public class IfScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력");
		int num = sc.nextInt();
		
		String msg = "50 미만입니다";
		
		if(num>=50) {
			System.out.println("50 이상입니다");
		}
		System.out.println("입력하신 정수는 :"+msg);
		sc.close();
	}
}
