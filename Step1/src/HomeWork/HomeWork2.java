package HomeWork;

public class HomeWork2 {
	public static void main(String[] args) {
		
		int sum = 0;
		int num = 0;
		while(true) {
			num++;
			sum += num;
			if(num % 10 == 0) {
				System.out.print(num);
			} else {
				System.out.printf("%d + " , num);
			} if(num % 10 == 0) {
				System.out.printf( " = " + sum + "\n");
			}
			if(num == 100) {
				break;
			}
		}
		System.out.println("--------------------------");
		System.out.println(sum);
	}
}
