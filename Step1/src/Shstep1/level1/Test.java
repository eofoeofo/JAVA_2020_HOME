package Shstep1.level1;

public class Test {
	public static void main(String[] args) {
		ProGamer p1 = new ProGamer();
		
		Game game = new Game();
		p1.playGame(game);
		
		StardewValley sDew = new StardewValley();
		p1.playGame(sDew); // 스타듀벨리는 게임의 자식이기에 자동 형변환이 이루어져서 p1.playGame(sDew);를 사용할 수 있게 된다. 
		
		Lol lol = new Lol();
		p1.playGame(lol);
		
		Animal animal = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		animal = new Animal();
		// 동물이 운다
		animal.crying();
		// 고양이가 야옹 운다
		animal = cat;
		animal.crying(); // 일일이 타입을 바꾸지 않아도 다형성으로 인하여 타입이 변하게 됨.
		// 개가 멍멍 운다
		animal = dog;
		animal.crying(); // 부모타입에 있는 필드,메소드의 경우에만 다형성이 사용가능하다.
//		animal.barking(); // 자식 클래스 해당 메소드가 있지만 부모 클래스에는 없는 경우에 호출 불가
	}
}
