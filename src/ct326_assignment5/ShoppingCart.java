/*
 * Name: Enda Kilgarriff 
 * Student ID: 17351606
 */

package ct326_assignment5;


import java.util.*;

public class ShoppingCart {
	
	private String customerName, date;
//	private Map<Object, Integer> cart = new HashMap<Object, Integer>();
	private ArrayList<Inventory> cart = new ArrayList<Inventory>();
	private ArrayList<Inventory> setInventory;
	
	
	public ShoppingCart(String customerName, String date) {
		this.customerName = customerName;
		this.date = date;
	}
	
	public String getCustomer() {
		return customerName;
	}
	
	public void addItem(String itemName, int quantity) {
		
			Inventory item = setInventory.get(searchInventory(itemName, setInventory));
			int quantityAvailable = item.getQuantity();
			
			if(quantityAvailable > 0 && quantityAvailable < quantity) {
//				cart.put(item, quantityAvailable);
				System.out.println();
				cart.add(new Inventory(item.getSKU(), item.getItemName(), quantityAvailable, item.getPrice()));
				System.out.println("Only " + quantityAvailable + " units of " + item.getItemName() + "are available.\n These have been added to your cart.");
			} 
			else if(quantityAvailable >= quantity) {
//				cart.put(item, quantity);
				cart.add(new Inventory(item.getSKU(), item.getItemName(), quantity, item.getPrice()));
				item.reduceQuantity(quantity);
				System.out.println(quantity + " unit(s) of " + itemName + " added to cart");
			} 
			else if(quantityAvailable == 0) System.out.println(item.getItemName() + " is not available at the moment.");
		
		
	}
	
	public void removeItem(String itemName, int quantity) {
//		Inventory item = setInventory.get(searchInventory(itemName));
		int indexRemove = searchInventory(itemName, cart);
		//System.out.println("Cart: " + cart);
		System.out.println("Remove " + quantity + " unit(s) of " + itemName);
		if(cart.get(indexRemove).getQuantity() <= quantity ) {
			// Removes all units from cart and removes item from list
			setInventory.get(indexRemove).addQuantity(quantity);
			cart.remove(cart.get(searchInventory(itemName, cart)));
		}
		else if(cart.get(indexRemove).getQuantity() > quantity) {
			// Only removes the quantity of items customer no longer wants.
			// Updates inventory with items put back
			setInventory.get(indexRemove).addQuantity(quantity);
			cart.get(indexRemove).reduceQuantity(quantity);
		}
		//cart.remove(cart.get(searchInventory(itemName, cart)));
		//setInventory.get(indexRemove).addQuantity(quantity);
	}
	
	public void availableInventory(ArrayList<Inventory> inventory) {
		setInventory = inventory;
	}
	
	public int searchInventory(String itemName, ArrayList<Inventory> list) {
		Collections.sort(list, c);
		Inventory tempItem = new Inventory(null, itemName, 0, 0);
		int index = Collections.binarySearch(setInventory, tempItem , c);
		//System.out.println("Index: " + index + "\tActing on: " + itemName);
		return index;
	}
	

	
	public String viewCart() {
		String output = "";
		double total = 0.0;
		output += date + "Name: " + customerName + " \n"; 
		for(Inventory i : cart) {
			output += i.getQuantity() + "\t" + i.getItemName() + "    \t €" + i.getPrice() + "\n";
			total += i.getPrice()*i.getQuantity();
		}
		System.out.println("Total: " + total);
		total = Math.round(total*100);
		output += "\t\t\t €" + total/100;
		return output;
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
