package Shstep1;

public class ForBreak {
	
	public static void main (String args[]) {
		
		for(int i=0; i<5; i++) {
			if(i == 3) break; 
				System.out.println(i);
		}
		System.out.println("탈출");
		
		int Jum = 85;
		if(Jum<=80){
			System.out.println("80보다 작거나 같다");
		}
		if(Jum>=80){
			System.out.println("80보다 크거나 같다");
		}
		int Num=9;
		if(Num<10) {
			System.out.println("10보다 작은 숫자");
		}
		else{
			System.out.println("10보다 같거나 큰 숫자");
		}
	}
}
