package Shstep1.Class;

public class School {
	public static void main(String[] args) {
		Student hgd = new Student();
		
		hgd.setName("홍길동");
		hgd.setAge(28);
		hgd.setId(1000);
		hgd.setScore(79);
		System.out.println("학생의 이름 : "+hgd.getName());
		System.out.println("학생의 나이 : "+hgd.getAge());
//		System.out.println(hgd);
		System.out.println("학생의 아이디 : "+hgd.getId());
		System.out.println("학생의 점수 :"+hgd.getScore());
	}
}
