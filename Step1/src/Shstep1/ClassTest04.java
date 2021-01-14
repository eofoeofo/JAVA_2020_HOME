package Shstep1;

class Card {
	// 공통점 : 가로, 세로 > 클래스 변수
	// 차이점 : 숫자, 문양 > 인스턴스 변수
	
	static int width = 150;
	static int heigth = 300;
	int number;
	String shape;
}
public class ClassTest04 {
	public static void main(String[] args) {
		
		Card c1 = new Card();
//		System.out.println(c1); // Shstep1.Card@153f5a29
		c1.number = 4;
		c1.shape = "Heart";
		
		Card c2 = new Card();
		c2.number = 7;
		c2.shape = "Spade";
		
		//c1이 바꾼 공용 사물함의 w,h값은  c1,c2 공통 적용된다.
		c1.width = 300;
		c1.heigth = 150;
		System.out.println(c2.width);
		System.out.println(c2.heigth);
		
		
		System.out.println(c2.number);
		
	}

}
