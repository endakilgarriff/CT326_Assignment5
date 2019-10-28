/*
 * Name: Enda Kilgarriff 
 * Student ID: 17351606
 */

package ct326_assignment5;

// Importing all libraries for List, collector and comparator 
import java.util.*;

import static java.util.Comparator.*;

class ShoppingCart {

	// Attributes and Lists for storing items added to cart
	// and for storing the inventory available to the customer
	private String customerName, date;
	private List<Inventory> cart = new ArrayList<>();
	private List<Inventory> setInventory;

	// Constructor
	ShoppingCart(String customerName, String date) {
		this.customerName = customerName;
		this.date = date;
	}

	// Returns the customers name as String
	String getCustomer() {
		return customerName;
	}

	// Method to addItem to the cart
	void addItem(String itemName, int quantity) {

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

	
	void removeItem(String itemName, int quantity) {
		 
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
	void availableInventory(List<Inventory> inventory) {
		setInventory = inventory;
	}
	
	// Searches the inventory passed for the item matching the itemName passed
	private int searchInventory(String itemName, List<Inventory> list) {
		list.sort(c); // Sorts array that we want to search (sorts alphabetically by itemName)
		Inventory tempItem = new Inventory(null, itemName, 0, 0); // Temp Inventory object
		// BinarySeach from collections returns index location of matching item from List
		return Collections.binarySearch(setInventory, tempItem, c);
	}

	// Presents items added to users cart with the total cost
	String viewCart() {
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

	// When called this sorts the list in order of the price of the item
	void sortByPrice() {
		cart.sort(c1);
	}

	// Compares the item names returns if they are a match
	private Comparator<Inventory> c = (item1, item2) -> item1.getItemName().compareTo(item2.getItemName());
	// Compares the price of items
	private Comparator<Inventory> c1 = comparingDouble(Inventory::getPrice);
}
