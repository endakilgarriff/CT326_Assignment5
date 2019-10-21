package ct326_assignment5;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Inventory {

	private String sku, itemName;
	private int quantity;
	private double price;
//	private List<Inventory> inventory;
	Hashtable<String, Object> inventory = new Hashtable<String, Object>();
	
	public Inventory(String sku, String itemName, int quantity, double price) {
		this.sku = sku;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}
	
	public void addToInventory() {
		inventory.put(this.getSKU(), this);
	}
	
	public String getSKU() {
		return sku;
	}
	
	@Override
	public String toString() {
		return sku + "\t" + itemName + "\t" + quantity + "\t" + price;
			
	}
	
	public String hashTablePrint() {
		return inventory.toString();
	}
	
	

}
