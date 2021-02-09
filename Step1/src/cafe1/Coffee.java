package cafe1;

public class Coffee {
	private String name;
	private int price;
	
	public Coffee(MenuItem mi) {
		name = mi.getName();
		price = mi.getPrice();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}	


}
