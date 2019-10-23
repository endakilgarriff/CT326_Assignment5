package ct326_assignment5;


import java.util.*;

public class ShoppingCart {
	
	private String customerName, date;
	private ArrayList<ShoppingCart> cart;
//	private HashMap<String,Inventory> setInventory;
	private List<Inventory> setInventory;
	
	
	public ShoppingCart(String customerName, String date) {
		this.customerName = customerName;
		this.date = date;
	}
	
	
	public void addItem(String item, int quantity) {
//		searchInventory(item);
//		cart.add();
	}
	
	public void removeItem(String item, int quantity) {
		
	}
	
//	public void availableInventory(HashMap<String, Inventory> inventory) {
//		setInventory = inventory;
//	}
	public void availableInventory(List<Inventory> inventory) {
		setInventory = inventory;
	}
	
//	public void searchInventory(String SKU) {
//		ArrayList<String> keys = new ArrayList<String>(setInventory.keySet());
//		Collections.sort(keys); // Sorted array of SKUs
//		int index = Collections.binarySearch(keys, SKU);
//		System.out.println(index);
//	}  
	
	public void searchInventory(String itemName) {
//		Collections.sort(setInventory);
		Inventory tempItem = new Inventory(null, itemName, 0, 0);
		int index = Collections.binarySearch(setInventory, tempItem , c);
		System.out.println(index);
		System.out.println("Returned: " + setInventory.get(index).toString());
//		inventory.iterator().forEachRemaining(System.out::println);
//		ArrayList<String> keys = new ArrayList<String>(setInventory.iterator());
//		Collections.sort(keys); // Sorted array of SKUs
//		int index = Collections.binarySearch(keys, itemName);
//		System.out.println(index);
	}
	
	public String viewCart() {
		return cart.toString();
	}

	Comparator<Inventory> c = new Comparator<Inventory>() {
		@Override
		public int compare(Inventory item1, Inventory item2) {
			return item1.getItemName().compareTo(item2.getItemName());
		}
	};



}
