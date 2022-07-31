package supermarket.shop;

public class DairyProduct extends GroceryMarket {
	private Fat Fat;
	public DairyProduct(String name, double price, double discount, Fat Fat) {
		super(name, price, discount);
		// TODO Auto-generated constructor stub
		this.Fat=Fat;
	}
	public Fat getFat() {
		return Fat;
	}
	public void setFat(Fat fat) {
		this.Fat = fat;
	}


	public String toString() {
		return super.toString()+"Fat Level: "+Fat;
	}

}
