package Shstep1.Class;
class Single {
	// 생성자의 접근 제어자를 private로 지정하여 
	public Single() {}
}

public class SingleMain {
	public static void main(String[] args) {
		// public Single() {}
		Single s1 = new Single();
		Single s2 = new Single();
		Single s3 = new Single();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		// public으로 생성된 생성자를 통하여 각각 인스턴스화 한다.
		// 때문에 각기 다른 메모리 주소값을 참조하는 비효율적인 결과가 나타난다.
	}
}
