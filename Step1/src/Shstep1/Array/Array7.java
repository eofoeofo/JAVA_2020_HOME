package Shstep1.Array;

public class Array7 {
	public static void main(String[] args) {
		// arr 배열 중 인덱스가 1인 곳을 출력하라
		int[] arr = {10,20,30,50,3,60,-3};
		System.out.println(arr[1]);
		
		// arr 배열 중 값이 60인 곳의 인덱스를 출력하라
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 60) {
				System.out.println(i);
			}
		}
		// arr 배열 안의 모든 값을 더 하고, 총합과 평균을 출력
		int sum=0;
		double avg=0.0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		avg = sum/arr.length;
		System.out.println("총합은 : "+sum+ "\n평균은 : "+avg);
		
		// arr 배열 중 인덱스 3을 제외하고 출력하라
		for(int i=0; i<arr.length; i++) {
			if(i == 3) {
				continue;
			}
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
	}
}
