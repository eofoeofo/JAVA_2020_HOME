package Shstep1;

import java.util.Scanner;

public class IfScanner4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력 하시오.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		double avg = (double)sum / 3.0;
		
		int max = num1;
		int min = num1;
		
		if(num2 > num3) { 
			if(num2 > max) {
				max = num2;
			}
		}	else if (num3 > max) {
				max = num3;
			}
		// 최대값
		if(num2 < num3) {
			if(num2 < min) {
				min = num2;
			}
		}	else if (num3 < min){
				min = num3;
			}
		// 최소값
		String msg = "최대값 : "+max +
					 "\n최소값 : "+min +
				     "\n합  계  : "+sum +
				     "\n평균값 : "+String.format("%.1f", avg);
		System.out.println(msg);
	}
}