package ct326_assignment5;

public class Inventory {

	private String sku, itemName;
	private int quantity;
	private double price;
	
	public Inventory(String sku, String itemName, int quantity, double price) {
		this.sku = sku;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}

	public String getSKU() {
		return sku;
	}

	@Override
	public String toString() {
		return sku + "\t" + itemName + "\t" + quantity + "\t" + price ;

	}

}
