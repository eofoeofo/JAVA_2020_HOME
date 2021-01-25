package Shstep1.tryCatch;

public class TryCatch02 {
	public static void main(String[] args) {
		int dividend = 10;
		try {
			int divisor = Integer.parseInt(args[0]);
			System.out.println(dividend / divisor);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			// 배열의 범위를 벗어난 인덱스 사용시 발생
			// main() 메소드의 인수가 없을 때 발생
			System.out.println("존재 하지 않습니다.");
		} catch (NumberFormatException e) {
			// main() 메소드의 인수를 숫자로 바꿀 수 없을 때 발생
			System.out.println("숫자가 아닙니다.");
		} catch (ArithmeticException e) {
			// main() 메소드의 인수가 0 일 때 나눌 수 없으므로 발생
			System.out.println("0으로 나눌 수 없습니다.");
		} finally { // 예외 발생과 관계없이 항상 실행.
			System.out.println("항상 실행 됩니다.");
		}
		System.out.println("종료");
	}
}
