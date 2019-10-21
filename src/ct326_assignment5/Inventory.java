package ct326_assignment5;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

	private String sku, itemName;
	private int quantity;
	private double price;
//	private List<Inventory> inventory;
	
	public Inventory(String sku, String itemName, int quantity, double price) {
		this.sku = sku;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
//		System.out.println("Object: " + this);
//		System.out.println(" List Size: " + inventory.size());
//		inventory.add(inventory.size() ,this);
	}
	
	
	@Override
	public String toString() {
		return sku + "\t" + itemName + "\t\t" + quantity + "\t" + price + "\n";
			
	}	

}
