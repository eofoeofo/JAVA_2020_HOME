package Shstep1.If;

import java.util.Scanner;

public class IfScanner3 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학년 과 점수를입력 : ");
		int grade = sc.nextInt();
		int score = sc.nextInt();
		String msg = "잘못 입력 하셨습니다.";
		
		if(0 <= score && score <= 100) { // 점수가 0미만 100초과할 시 경고 메세지 출력
			if(0 <= grade && grade <=4) { //학년이 0미만 4초과할 시 경고 메세지 출력
			if(60<=score) {
				if(grade != 4) { // 1~3학년 60점 이상 합격 메세지 출력
					msg = "합격 하셨습니다.";
				} else if(70<=score) { // 4학년 70점 이상 합격 메세지 출력
					msg = "합격 하셨습니다.";
				} else {
					msg = "불합격 하셨습니다.";
				}
				} else {
					msg = "불합격 하셨습니다.";
				}
			}
		}
			System.out.println(msg);
			sc.close();
		}
}	
