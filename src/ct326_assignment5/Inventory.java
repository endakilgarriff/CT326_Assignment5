package ct326_assignment5;

import java.util.ArrayList;

public class Inventory {

	private String sku, itemName;
	private int quantity;
	private double price;
	private ArrayList<Inventory> inventory;
	
	public Inventory(String sku, String itemName, int quantity, double price) {
		this.sku = sku;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
		System.out.println(this);
		inventory.add(this);
	}
	
	
	@Override
	public String toString() {
		return sku + "\t" + itemName + "\t" + quantity + "\t" + price + "\n";
			
	}	

}
