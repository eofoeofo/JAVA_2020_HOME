package Shstep1.Array;

import java.util.Scanner;

// 양의 정수 10개를 입력 받아 배열에 저장하고,
// 배열에 있는 정수 중 3의 배수만 출력하자.
public class Array9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 10개 입력 :");
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("3의 배수 :");
		for(int i=0; i<arr.length; i++) {
			if(i % 3 == 0) {
			}
			System.out.println(arr[i]+" ");
		}
		
	}
}
