package Shstep1.Array;

public class Array8 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 50, 3, 60, -3 };
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최대값 :"+max+"\n최소값:"+min);
	}
}
