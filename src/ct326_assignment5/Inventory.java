package ct326_assignment5;

import java.util.ArrayList;
import java.util.HashMap;

public class Inventory {

	private String sku, itemName;
	private int quantity;
	private double price;
	HashMap<String,Inventory> setInventory;
	
	public Inventory(String sku, String itemName, int quantity, double price) {
		this.sku = sku;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}

	public String getSKU() {
		return sku;
	}
	
	public String getItemName() {
		return itemName;
	}
	
//	public void availableInventory(HashMap<String,Inventory> inventory) {
//		setInventory = inventory;
//	}
//	
//	public ArrayList<Inventory> getInventory() {
//		return inventory;
//	}

	@Override
	public String toString() {
		return sku + "\t" + itemName + "\t" + quantity + "\t" + price ;

	}

}
