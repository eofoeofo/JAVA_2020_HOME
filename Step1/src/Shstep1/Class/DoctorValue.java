package Shstep1.Class;

public class DoctorValue extends PersonValue {
	public DoctorValue() {
		System.out.println(">>Doctor");
		this.setInfo();
	}
	public void treat() {
		System.out.println("treat");
	}
}
