package Shstep1.Class;

class PrivateTest {
	private PrivateTest() {}
	private static PrivateTest s = null;
	public static PrivateTest getInstance() {
		// 메모리 주소를 하나만 참조 할 수 있도록 제한
		if(s == null) {
			s = new PrivateTest();
		}
		// 만약 객체가 한 번 이상 인스턴스화 된다면 null값 대신 주소값을 참조하게 된다
		// null 값이 아닌 주소값을 가지게 될 때 인스턴스화를 더 이상 실행하지 않고
		// 이미 생성된 객체 s를 반환한다
		return s;
	}
}
public class SinglePrivate {
	public static void main(String[] args) {
		PrivateTest p1 = PrivateTest.getInstance();
		PrivateTest p2 = PrivateTest.getInstance();
		
		System.out.println(p1);
		System.out.println(p2);
		
	}
}
