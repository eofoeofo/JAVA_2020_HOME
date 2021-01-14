package Shstep1;

public class ex1 {
	public static void main(String[] args) {
		int result = sum(10,5);
		System.out.println(result);
		printName("김상혁",170);
		
	}
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static void printName(String str, int key) {
		System.out.println("나는" +str+key+"이건 프린트 네임 함수입니다.");
	}
}
