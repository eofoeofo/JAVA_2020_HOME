package Shstep1;

import java.util.Arrays;

public class Array5 {
	public static void main(String[] args) {
		int[] Iarr = {10,3,103,293,4,6,199,34,699,23,4,63,54,76,42};
		int temp;
		for(int i=0; i<Iarr.length; i++) {
			for(int j=0; j<Iarr.length-1; j++) {
				if(Iarr[j]>Iarr[j+1]) {
					temp = Iarr[j];
					Iarr[j] = Iarr[j+1];
					Iarr[j+1] = temp;
				}
				System.out.println(j+"의 값:"+Arrays.toString(Iarr));
			}
		}
		System.out.println("--------------------------------------------");
		System.out.println(Arrays.toString(Iarr));
		for(int z=0; z<Iarr.length; z++) {
			System.out.println(Iarr[z]);
		}
	}
}
