package Shstep1;
//	Tv 클래스
//	1. 특징(변수)
//	1) Brand (Stirng)
//	2) Color (String)
//	3) Price (int)
//	4) Channel (int)
//
//	2. 기능(메소드)
//	1) ChannelUp() : 1 증가
//	2) ChannelDown() : 1 감소
// 클래스
class Tv {
	String brand;
	String color;
	int price;
	int channel;
	
	Tv(String brand,String color,int price, int channel){
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.channel = channel;
	}
// 메소드
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	void showInfo() {
		System.out.println("브랜드 : " + brand);
		System.out.println("색   상 : " + color);
		System.out.println("가   격 : " + price);
		System.out.println("채   널 : " + channel);
	}
}
public class ClassTest06 {
	public static void main(String[] args) {
		Tv myTv = new Tv("LG","블랙",1500000,12); // 인스턴스화 할때는 생성자 매개변수의 값을 초기화 해줘야함
//		myTv.brand = "삼성";
//		myTv.color = "블랙";
//		myTv.price = 1000;
//		myTv.channel = 7;
		
		myTv.showInfo();
		
		myTv.channelDown();
		myTv.channelDown();
		myTv.channelDown();
		myTv.channelUp();
		
		System.out.println("현재 나의 TV 채널 : "+ myTv.channel);
		
	}

}
