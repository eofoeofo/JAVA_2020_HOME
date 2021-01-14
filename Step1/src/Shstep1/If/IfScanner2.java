package Shstep1.If;

import java.util.Scanner;

public class IfScanner2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 :");
		int num = sc.nextInt();
		
		String msg = "3의 배수가 아닙니다";
		
		// 조건연산자(삼항연산자) A ? B : C;
		if(num % 3 == 0) {
			msg = "3의 배수 입니다";
		}
		System.out.printf("입력하신 정수는 :"+msg);
		sc.close();
	}
}
