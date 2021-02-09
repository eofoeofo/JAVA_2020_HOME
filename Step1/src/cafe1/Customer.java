package cafe1;

import java.util.Scanner;

public class Customer {
	public MenuItem order(Menu m) {
		m.showMenus();
		Scanner sc = new Scanner(System.in);
		MenuItem mi = null;
		while(mi == null) {
			try {
				System.out.println("메뉴 번호를 입력 해 주세요 : ");
				String menuNo = sc.nextLine();
				int intMenuNo = Integer.parseInt(menuNo);
				mi = m.choose(intMenuNo - 1);
			} catch(NumberFormatException e) {
				System.out.println("숫자를 입력 해 주세요.");
			} catch(Exception e) {
				System.out.println("메뉴를 잘못 선택 하셨습니다.");
			}
		}
		sc.close();
		return mi;
		}
	public void drinkCoffee(Coffee coffee) {
		System.out.printf("%s를 마신다.",coffee.getName());
	}
}
