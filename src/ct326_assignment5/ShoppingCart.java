package ct326_assignment5;


import java.util.*;

public class ShoppingCart implements Comparator<Inventory>{
	
	private String customerName, date;
//	private HashMap<ShoppingCart> cart;
	private List<Inventory> setInventory;
	
	public ShoppingCart(String customerName, String date) {
		this.customerName = customerName;
		this.date = date;
	}
	
	
	public void addItem(String item, int quantity) {
//		cart.add();
	}
	
	public void removeItem(String item, int quantity) {
		
	}
	
	public void availableInventory(ArrayList<Inventory> inventory) {
		setInventory = inventory;
	}
	
//	public void SearchInventory() {
//		Collections.sort(setInventory);
//		int result = Collections.binarySearch();
//	}  
	
//	public String viewCart() {
//		return cart.toString();
//	}
//
//	@Override
//	public int compare(Inventory arg0, Inventory arg1) {
//		// TODO Auto-generated method stub
//		return ;
//	}

}
