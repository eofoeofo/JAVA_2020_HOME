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
	}
}
