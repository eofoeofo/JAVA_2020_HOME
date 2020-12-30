package Shstep1;

import java.util.Scanner;

public class IfScanner5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수학 응시 유형을 선택 해 주세요(가/나)");
		System.out.println("점수를 입력 해 주세요.");
		String math= sc.next();
		int score = sc.nextInt();
		int dafultNum = 70;
		
		String msg = "잘못 입력 하셨습니다.";
		// 가형 60점 미만 
		
		if("가".equals(math)) {
			if (score>dafultNum) {
				msg = "평균 초과 입니다.";
			}
			else if(score<dafultNum) {
				msg = "평균 미만 입니다.";
			}
			else
				msg = "평균 입니다";
			}
		else if ("나".equals(math)) {
			
		}
		System.out.println(msg);
		sc.close();
		}
}
