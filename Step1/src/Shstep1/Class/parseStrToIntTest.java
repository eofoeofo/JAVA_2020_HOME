package Shstep1.Class;

public class parseStrToIntTest {
	public static void main(String[] args) {
		ScanNum sn = new ScanNum();
		String str = sn.inputNumString();
		int result = Utils.parseStrToInt(str);
	}
}
