package Shstep1;

import java.util.Scanner;

public class Just {
	public static void maim(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수학 응시 유형을 선택 해 주세요(가/나)");
		System.out.println("점수를 입력 해 주세요.");
		String math= sc.next();
		int score = sc.nextInt();
		int dafultNum = 60;
		
		String msg = "잘못 입력 하셨습니다.";
		// 가형 60점 미만 
		
		if("가".equals(math)) {
			if (score>60) {
				msg = "평균 초과 입니다.";
			}
			else if(score<60) {
				msg = "평균 미만 입니다.";
			}
			else
				msg = "평균 입니다.";
			}
		System.out.println(msg);
		}
	}
