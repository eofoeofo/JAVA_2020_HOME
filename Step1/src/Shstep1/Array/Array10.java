package Shstep1.Array;

import java.util.Scanner;

// 과목 이름을 입력받아 해당 과목 점수를 출력 해주는 프로그램을 작성
// 무한반복 하다가 "그만"을 입력 받으면 프로그램이 종료
public class Array10 {
	public static void main(String[] args) {
		String[] title = {"Java", "Python", "Android", "JSP", "HTML"};
        int[] score = {95, 88, 76, 62, 55};
        
        Scanner sc = new Scanner(System.in);
        
        while(true) {
        	System.out.println("과목명을 입력 하세요:");
        	String name = sc.next();
        	
        	for(int i=0; i<title.length; i++) {
        		if(title[i].equals(name)) {
        			System.out.println(title[i]+"의 점수 :"+score[i]);
        		}
        	}
        	if(name.equals("그만")) {
        		break;
        	}
        }
	}
}
