package Shstep1;

public class While1 {
	public static void main(String[] args) {
		int i = 0;
		while(i < 11) {
			i++;
			System.out.println(i);
			if(i % 2 == 0) {
				System.out.printf("%d은(는) 짝수 입니다.\n",i);
			}
		}
	}
}
