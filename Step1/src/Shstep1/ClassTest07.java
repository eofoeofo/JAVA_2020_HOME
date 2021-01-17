package Shstep1;

import java.util.Scanner;

class Calc1{
	static int sum(int num1, int num2) {
		return num1 + num2; 
	}
	static int sub(int num1, int num2) {
		return num1 - num2;
	}
	static int mul(int num1, int num2) {
		return num1 * num2;
	}
	static double div(double num1, double num2) {
		double result = -1;
		if (num2 != 0) {
			result = num1 / num2;
		}
		return result;
	}
	static void showInfo(int num1, int num2) {
		System.out.println("덧셈 결과 :" +sum(num1,num2));
		System.out.println("뺄셈 결과 :" +sub(num1,num2));
		System.out.println("곱셈 결과 :" +mul(num1,num2));
		System.out.println("나눗셈 결과 :" +div(num1,num2));
	}
}

public class ClassTest07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 1 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("정수 2 입력 : ");
		int num2 = sc.nextInt();
		System.out.println();
		Calc1.showInfo(num1, num2);
	}

}
