package Shstep1.baseball;

public class Checker {
	// 스트라이크, 볼, 아웃 개수 확인하는 클래스
	static int strike = 0;
	static int Cntball = 0;
	int gameCnt = 3;
		public static boolean check(int gameCnt, Baseball ball, MyBall myBall) {
			ball.getRNum(gameCnt);
			System.out.printf("s: %d / b: %d / o: %d\n", strike, Cntball, gameCnt-strike-Cntball);
			while(true) {
				if(strike==gameCnt) {
					break;
				}
			}
			return false;
		}
	}