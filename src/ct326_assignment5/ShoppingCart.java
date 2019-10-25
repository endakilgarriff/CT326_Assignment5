/*
 * Name: Enda Kilgarriff 
 * Student ID: 17351606
 */

package ct326_assignment5;

// Importing all libraries for Arraylist, collector and comparator 
import java.util.*;

public class ShoppingCart {

	// Attributes and ArrayLists for storing items added to cart
	// and for storing the inventory available to the customer
	private String customerName, date;
	private ArrayList<Inventory> cart = new ArrayList<Inventory>();
	private ArrayList<Inventory> setInventory;

	// Constructor
	public ShoppingCart(String customerName, String date) {
		this.customerName = customerName;
		this.date = date;
	}

	// Returns the customers name as String
	public String getCustomer() {
		return customerName;
	}

	// Method to addItem to the cart
	public void addItem(String itemName, int quantity) {

		// Searches inventory available to customer for the item the customer wants.
		// Creates temp item to store wanted item details
		Inventory item = setInventory.get(searchInventory(itemName, setInventory));
		int quantityAvailable = item.getQuantity(); 
		
		// Checks if the desired amount of item is available
		// if there is less than the desired amount but some in stock, 
		// what is left is added and the customer is notified
		if (quantityAvailable > 0 && quantityAvailable < quantity) {
			// Creates new item of type Inventory with quantity that the customer wants
			cart.add(new Inventory(item.getSKU(), item.getItemName(), quantityAvailable, item.getPrice()));
			item.reduceQuantity(quantityAvailable);
			System.out.println("Only " + quantityAvailable + " units of " + item.getItemName()
					+ " are available.\n\t These have been added to your cart.");
		}
		// if there is enough for the customer they are added to the cart
		else if (quantityAvailable >= quantity) {
			cart.add(new Inventory(item.getSKU(), item.getItemName(), quantity, item.getPrice()));
			item.reduceQuantity(quantity);
			System.out.println(quantity + " unit(s)" + " of " + itemName + " added to cart");
		}
		// If there is no stock of item message is returned to customer
		else if (quantityAvailable == 0)
			System.out.println(item.getItemName() + " is not available at the moment.");
		// The below message is returned if we have none of the desired item
		else { 
			System.out.println("Item unavailable, sorry");
		}
	}  // End addItem()

	
	public void removeItem(String itemName, int quantity) {
		 
		int indexRemove = searchInventory(itemName, cart);
		
		System.out.println("Remove " + quantity + " unit(s) of " + itemName);
		// Removes all units from cart and removes item from list
		if (cart.get(indexRemove).getQuantity() <= quantity) {
			setInventory.get(indexRemove).addQuantity(quantity);
			cart.remove(cart.get(searchInventory(itemName, cart)));
		} 
		// Only removes the quantity of items customer no longer wants.
		// Updates inventory with items put back
		else if (cart.get(indexRemove).getQuantity() > quantity) {
			
			setInventory.get(indexRemove).addQuantity(quantity);
			cart.get(indexRemove).reduceQuantity(quantity);
		}
	}

	// Gets the inventory made available in the Test class so action
	// can be taken on them by the customer
	public void availableInventory(ArrayList<Inventory> inventory) {
		setInventory = inventory;
	}
	
	// Searches the inventory passed for the item matching the itemName passed
	public int searchInventory(String itemName, ArrayList<Inventory> list) {
		Collections.sort(list, c); // Sorts array that we want to search
		Inventory tempItem = new Inventory(null, itemName, 0, 0); // Temp Inventory object
		// BinarySeach from collections returns index location of matching item from List
		int index = Collections.binarySearch(setInventory, tempItem, c);
		return index;
	}

	// Presents items added to users cart with the total cost
	public String viewCart() {
		String output = "";
		double total = 0.0;
		output += date + "\tName: " + customerName + " \n";
		for (Inventory i : cart) {
			output += i.getQuantity() + "\t" + i.getItemName() + "    \t €" + i.getPrice() + "\n";
			total += i.getPrice() * i.getQuantity();
		}
		total = Math.round(total * 100);
		output += "\tTotal\t\t €" + total / 100;
		return output;
	}

	// Compares the item names returns if they are a match
	Comparator<Inventory> c = new Comparator<Inventory>() {
		@Override
		public int compare(Inventory item1, Inventory item2) {
			return item1.getItemName().compareTo(item2.getItemName());
		}
	};
	
}
