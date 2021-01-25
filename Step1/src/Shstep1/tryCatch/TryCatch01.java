package Shstep1.tryCatch;

public class TryCatch01 {
	public static void main(String[] args) {
		int[] array = {0,1,2};
		try {
			System.out.println("마지막 원소 -> "+array[3]);
			System.out.println("첫번쨰 원소 -> "+array[0]);
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("존재 하지 않습니다.");
		}
		System.out.println("어이구");
	}
}
