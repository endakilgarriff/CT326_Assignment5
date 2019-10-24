/*
 * Name: Enda Kilgarriff 
 * Student ID: 17351606
 */

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
	
	public void reduceQuantity(int quantity) {
		this.quantity -= quantity;
	}
	
	public void addQuantity(int quantity) {
		this.quantity += quantity;
	}
	
	public String getSKU() {
		return sku;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
//		String output = String.format("%s \t %s \t%-20s% %s", sku, itemName, quantity, price);
		return sku + "\t" + itemName + "    \t" + quantity + " \t" + price ;
//		return output;

	}

}
