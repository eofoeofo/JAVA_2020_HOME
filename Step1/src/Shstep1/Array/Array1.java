package Shstep1.Array;

public class Array1 {
	public static void main(String[] args) {
		String[] week = {"월","화","수","목","금","토","일"};
		System.out.println(week[4]);
		
		for(int i=0; i<week.length-1; i++) {
		
		for(int j=0; j<week.length; j++) {
			System.out.print("\n"+week[j]);
		}
		System.out.println();
		}
	}
}
