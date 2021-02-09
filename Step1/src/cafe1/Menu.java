package cafe1;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private List<MenuItem> arr = new ArrayList<>();
	
	public Menu() {
		arr.add(new MenuItem("아메리카노", 2000));
		arr.add(new MenuItem("카푸치노", 3000));
		arr.add(new MenuItem("바닐라 라떼", 4000));
		arr.add(new MenuItem("자바칩 푸라푸치노", 5000));
	}
	
	public void menuSetter(MenuItem mi) {
		arr.add(mi);
	}
	
	public void showMenus() {
		System.out.println(" MENU ");
		for (int i=0; i<arr.size(); i++) {
			MenuItem m = arr.get(i);
			System.out.printf("%d. %s\t\t%,원\n", i+1 , m.getName(), m.getPrice());
		}
		return;
	}
	
	public MenuItem choose(int idx) {
		return arr.get(idx);
	}

}
