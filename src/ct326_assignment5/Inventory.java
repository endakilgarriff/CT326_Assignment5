/*
 * Name: Enda Kilgarriff 
 * Student ID: 17351606
 */

package ct326_assignment5;

public class Inventory {

	// Variables and attributes
	private String sku, itemName;
	private int quantity;
	private double price;

	// Create constructor where Inventory items are created.
	public Inventory(String sku, String itemName, 
			int quantity, double price) {
		this.sku = sku;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}

	// Setter and getter methods

	// Returns quantity available for a given item
	public int getQuantity() {
		return quantity;
	}

	// Reduces the quantity available in inventory of a given item
	public void reduceQuantity(int quantity) {
		this.quantity -= quantity;
	}

	// Increases the quantity available in inventory for a given item
	public void addQuantity(int quantity) {
		this.quantity += quantity;
	}

	// Returns the String SKU value of an item
	public String getSKU() {
		return sku;
	}

	// Returns the String name value of an item
	public String getItemName() {
		return itemName;
	}

	// Returns the double price value of an item
	public double getPrice() {
		return price;
	}

	@Override
	// toString override to return details
	// of an item in the inventory in a given format.
	public String toString() {
		return sku + "\t" + itemName + "    \t" + quantity + 
				" \t" + price;
	}

}
