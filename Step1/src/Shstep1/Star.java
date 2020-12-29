package Shstep1;

public class Star {
	public static void main(String args[]) {
		for (int i=1; i<8; i++ ) {
			for (int k=1; k<8-i; k++) {
				System.out.printf(" ");
			}
			for (int j=1; j<i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i=0; i<8; i++) {
			for (int j=0; j<2*i; j++) {
			System.out.printf("*");
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");
		
		for (int i=1; i<10; i++) {
			for (int j=1; j<10; j++) {
				System.out.printf(i+"*"+j+"="+(i*j)+" ");
			}
			System.out.printf("\n");
		}
		
		for (int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}
