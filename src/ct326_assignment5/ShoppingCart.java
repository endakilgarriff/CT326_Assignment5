package ct326_assignment5;


import java.util.ArrayList;
//import java.util.Arrays.binarySearch();

public class ShoppingCart {
	
	private String customerName, date;
	private ArrayList<ShoppingCart> cart;
	
	public ShoppingCart(String customerName, String date) {
		this.customerName = customerName;
		this.date = date;
	}
	
	public void addItem() {
//		cart.add();
	}
	
	public void removeItem() {
		
	}
	
	public void SearchInventory(String item) {
//		Inventory inventory = binarySearch(Inventory.getInventory(), 3);
	}
	
	public String viewCart() {
		return cart.toString();
	}

}
