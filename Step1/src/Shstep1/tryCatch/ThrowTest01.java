package Shstep1.tryCatch;

import java.util.Scanner;

public class ThrowTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			square(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("정수가 아닙니다.");
		}
	}
	
	private static void square(String s) throws NumberFormatException {
		int n = Integer.parseInt(s);
		System.out.println(n * n);
	}
}
