package Shstep1;

public class Nothing {
	
	public static void main(String args[]) {
		
		String apple = "사과";
		int pay = 500;
		int a = 2_000_000_000;
		long b = 2_000_000_000L;
		int c = 500;
		
		for (int i=1 ; i<10 ; i ++) {
			for (int j=1; j<10; j ++) {
			System.out.printf(i+" * "+j+" = "+(i*j)+" | ");
		}
			System.out.printf("\n");
	}
		
		System.out.println(apple);
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.printf("%s는 %d원 입니다",apple,c);
	}

}
