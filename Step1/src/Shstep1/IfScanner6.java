package Shstep1;

import java.util.Scanner;

public class IfScanner6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력 하시오 : ");
		int score = sc.nextInt();
		
		String msg = "F 입니다.";
		if(score <= 90 && 100 >= score) {
			msg = "A 입니다.";
		}
		else if(score <= 80 && 89 >= score) {
			msg = "B 입니다.";
		}
		else if(score <= 70 && 79 >= score) {
			msg = "C 입니다.";
		}
		else if(score <= 60 && 69 >= score){
			msg = "D 입니다.";
		}
		System.out.println(msg);
		sc.close();
	}

}
