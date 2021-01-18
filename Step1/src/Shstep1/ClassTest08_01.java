package Shstep1;

public class ClassTest08_01 {
	public static void main(String[] args) {
		ClassTest08 ct = new ClassTest08("LG","화이트",230000,20,49);
		
		ct.channelUp(); // 메소드 호출 방식
		
		System.out.println("브 랜 드   : "+ct.brand);
		System.out.println("색     상   : "+ct.color);
		System.out.println("가     격   : "+ct.price);
		System.out.println("채     널   : "+ct.channel);
		System.out.println("화면 크기 : "+ct.size);
	}
}
