package ct326_assignment5;


import java.util.*;

public class ShoppingCart {
	
	private String customerName, date;
	private Map<Object, Integer> cart = new HashMap<Object, Integer>();
	private ArrayList<Inventory> setInventory;
	
	
	public ShoppingCart(String customerName, String date) {
		this.customerName = customerName;
		this.date = date;
	}
	
	
	public void addItem(String itemName, int quantity) {
		// get the item for the inventory
			// if the quantity is too little for the amount that we want return message with quantity, sell available.
			// if the quantity is 0 then print message to say that not available
		// if there is enough. Add the item and quantity to cart and reduce from inventory.
			Inventory item = setInventory.get(searchInventory(itemName));
			int quantityAvailable = item.getQuantity();
			
			if(quantityAvailable > 0 && quantityAvailable < quantity) {
				cart.put(item, quantityAvailable);
				System.out.println("Only " + quantityAvailable + "units of " + item.getItemName() + "are available.\n These have been added to your cart.");
			} else if(quantityAvailable >= quantity) {
				cart.put(item, quantity);
				setInventory.get(searchInventory(itemName)).reduceQuantity(quantity);
			} else if(quantityAvailable == 0) System.out.println(item.getItemName() + " is not available at the moment.");
		
		
	}
	
	public void removeItem(String itemName, int quantity) {
		Inventory item = setInventory.get(searchInventory(itemName));
		System.out.println(cart);
		System.out.println("Remove item: " + cart.get(item));
		cart.remove(itemName);
		setInventory.get(searchInventory(itemName)).addQuantity(quantity);
	}
	
	public void availableInventory(ArrayList<Inventory> inventory) {
		setInventory = inventory;
	}
	
	public int searchInventory(String itemName) {
		Collections.sort(setInventory, c);
		Inventory tempItem = new Inventory(null, itemName, 0, 0);
		int index = Collections.binarySearch(setInventory, tempItem , c);
		System.out.println("Index: " + index);
		return index;
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

	public ArrayList<Inventory> updateInventory() {
		ArrayList<Inventory> inventoryAfterSale = setInventory;
		return inventoryAfterSale;
	}

}
