/*
 * Name: Enda Kilgarriff 
 * Student ID: 17351606
 */

package ct326_assignment5;

import java.util.*;

public class Test {

	public static void main(String[] args) {
	
//		HashMap<String,Inventory> inventory = new HashMap<String,Inventory>();
		ArrayList<Inventory> inventory = new ArrayList<Inventory>();
		
		Inventory inventory1 	= new Inventory("1000", "Apple", 30, 2.50);
		Inventory inventory2 	= new Inventory("1001", "Orange", 40, 2);
		Inventory inventory3 	= new Inventory("2001", "Milk", 10, 2.39);
		Inventory inventory4 	= new Inventory("2002", "Orange Juice", 20, 1.99);
		Inventory inventory5 	= new Inventory("3001", "Blue Cheese", 10, 2.25);
		Inventory inventory6 	= new Inventory("3002", "Cheddar", 20, 2.79);
		Inventory inventory7 	= new Inventory("4001", "Chocolate", 40, 2.99);
		Inventory inventory8 	= new Inventory("4002", "Candy", 30, 0.99);
		Inventory inventory9 	= new Inventory("5001", "Beef", 10, 5.00);
		Inventory inventory10	= new Inventory("5002", "Chicken", 10, 4.00);
		
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
	    
		System.out.println("Enda Kilgarriff - 17351606 \nPrint Inventory:");
		inventory.iterator().forEachRemaining(System.out::println);
		
//		for(Inventory i : inventory) {
//			System.out.println(i.toString());
//		}
		
		ShoppingCart cart1 = new ShoppingCart("Mark F", "23/10/2019");
		cart1.availableInventory(inventory);
//		cart1.searchInventory("Apple");
		System.out.println("\nPrinting Inventory before: " + cart1.getCustomer() + " shops");
		inventory.iterator().forEachRemaining(System.out::println);
		System.out.println("\n -------- CART 1 --------\n");
		cart1.addItem("Apple", 2);
		cart1.addItem("Orange", 5);
		cart1.addItem("Milk", 2);
		cart1.addItem("Blue Cheese", 4);
		cart1.addItem("Candy", 25);
		cart1.removeItem("Candy", 5);
		System.out.println("\nPrinting Inventory after: " + cart1.getCustomer() + " shops");
		inventory.iterator().forEachRemaining(System.out::println);
		inventory = cart1.updateInventory();
		
		System.out.println("\nViewing cart");
		System.out.println(cart1.viewCart());
		
		ShoppingCart cart2 = new ShoppingCart("Aiden G", "24/10/2019");
		cart2.availableInventory(inventory);
		System.out.println("\nPrinting Inventory before: " + cart2.getCustomer() + " shops");
		inventory.iterator().forEachRemaining(System.out::println);
		System.out.println("\n -------- CART 2 --------\n");
		cart2.addItem("Apple", 2); 
		cart2.addItem("Orange", 5); 
		cart2.addItem("Milk", 2) ;
		cart2.addItem("Blue Cheese", 4); 
		cart2.addItem("Cheddar", 3);
		cart2.addItem("Beef", 6);
		cart2.addItem("Candy", 20); 
		cart2.addItem("Chocolate", 10); 
		cart2.addItem("Chicken", 2);
		cart2.removeItem("Chocolate", 5); 
		cart2.removeItem("Blue Cheese", 1);
		
		System.out.println("\nViewing cart");
		System.out.println(cart2.viewCart());
		
		System.out.println("\nPrinting Inventory after: " + cart2.getCustomer() + " shops");
		inventory.iterator().forEachRemaining(System.out::println);
	}
}
