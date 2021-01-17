package Shstep1;

public class PhoneTest {
	public static void main(String[] args) {
		Phone myphone = new Phone("갤럭시","블랙",200);
		
		Phone myphone1 = new Phone("갤2","화이트");
		
		System.out.println(myphone.name);
		
		System.out.println(myphone1.name);
		System.out.println(myphone1.memory+"G");
	}
}
