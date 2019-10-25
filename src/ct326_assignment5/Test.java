/*
 * Name: Enda Kilgarriff 
 * Student ID: 17351606
 */

package ct326_assignment5;

// Importing Arraylist 
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		// Creating Arraylist to store inventory (Implementation developed before
		// changes to brief)
		ArrayList<Inventory> inventory = new ArrayList<Inventory>();

		// Creating the items that will be available in inventory.
		Inventory inventory1 = new Inventory("1000", "Apple", 30, 2.50);
		Inventory inventory2 = new Inventory("1001", "Orange", 40, 2);
		Inventory inventory3 = new Inventory("2001", "Milk", 10, 2.39);
		Inventory inventory4 = new Inventory("2002", "Orange Juice", 20, 1.99);
		Inventory inventory5 = new Inventory("3001", "Blue Cheese", 10, 2.25);
		Inventory inventory6 = new Inventory("3002", "Cheddar", 20, 2.79);
		Inventory inventory7 = new Inventory("4001", "Chocolate", 40, 2.99);
		Inventory inventory8 = new Inventory("4002", "Candy", 30, 0.99);
		Inventory inventory9 = new Inventory("5001", "Beef", 10, 5.00);
		Inventory inventory10 = new Inventory("5002", "Chicken", 10, 4.00);

		// Adding inventory items to the Inventory Arraylist
		inventory.add(inventory1);
		inventory.add(inventory2);
		inventory.add(inventory3);
		inventory.add(inventory4);
		inventory.add(inventory5);
		inventory.add(inventory6);
		inventory.add(inventory7);
		inventory.add(inventory8);
		inventory.add(inventory9);
		inventory.add(inventory10);

		// Printing out inventory.
		System.out.println("Enda Kilgarriff - 17351606 \nPrint Inventory:");
		inventory.iterator().forEachRemaining(System.out::println);

		// Creating shopping cart for customer, passing the inventory available that was
		// added above to the ShoppingCart class.
		ShoppingCart cart1 = new ShoppingCart("Mark Farrell", "23/10/2019");
		cart1.availableInventory(inventory);
		
		// Printing inventory before customer one takes any items from inventory
		System.out.println("\nPrinting Inventory before " + cart1.getCustomer() + " shops");
		inventory.iterator().forEachRemaining(System.out::println);
		
		// Adds/removes items from customer cart as desired. Prints out details of 
		// item availability and actions performed as they are carried out.
		System.out.println("\n ---------- CART 1 ----------\n");
		cart1.addItem("Apple", 2);
		cart1.addItem("Orange", 5);
		cart1.addItem("Milk", 2);
		cart1.addItem("Blue Cheese", 4);
		cart1.addItem("Candy", 25);
		cart1.removeItem("Candy", 5);
		
		// Printing inventory left after customer takes items from inventory
		System.out.println("\nPrinting Inventory after " + cart1.getCustomer() + " shops");
		inventory.iterator().forEachRemaining(System.out::println);

		// Printing contents of cart 1 with total cost of the items
		System.out.println("\n - - - Viewing cart 1 - - - ");
		System.out.println(cart1.viewCart());
		
		// Creating cart2 and passing inventory to the Shopping cart class.
		ShoppingCart cart2 = new ShoppingCart("Michael Foxx", "24/10/2019");
		cart2.availableInventory(inventory);
		
		//Printing the inventory available before the second customer takes items
		System.out.println("\nPrinting Inventory before " + cart2.getCustomer() + " shops");
		inventory.iterator().forEachRemaining(System.out::println);
		
		// Adds/removes items from customer cart as desired. Prints out details of 
		// item availability and actions performed as they are carried out.
		System.out.println("\n ---------- CART 2 ----------\n");
		cart2.addItem("Apple", 2);
		cart2.addItem("Orange", 5);
		cart2.addItem("Milk", 2);
		cart2.addItem("Blue Cheese", 4);
		cart2.addItem("Cheddar", 3);
		cart2.addItem("Beef", 6);
		cart2.addItem("Candy", 20);
		cart2.addItem("Chocolate", 10);
		cart2.addItem("Chicken", 2);
		cart2.removeItem("Chocolate", 5);
		cart2.removeItem("Blue Cheese", 1);

		// Print out contents of cart after customer add/removes what they want. 
		// Gives their details, date of transaction and the cost of the shop
		System.out.println("\n - - - Viewing cart 2 - - - ");
		System.out.println(cart2.viewCart());
		
		// Prints out all the final inventory after the customer have done their shopping.
		System.out.println("\nPrinting Inventory after " + cart2.getCustomer() + " shops");
		inventory.iterator().forEachRemaining(System.out::println);
	}
}
