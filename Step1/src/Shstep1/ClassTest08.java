package Shstep1;

public class ClassTest08 extends Tv {
	int size;

	// 생성자
	ClassTest08(String brand, String color, int price, int channel, int size) {
		super(brand , color , price , channel);
		this.size = size;
	}
	
	// 메소드
	@Override
	void channelUp() {
		channel++;
	}
	@Override
	void channelDown() {
		channel--;
	}
}
