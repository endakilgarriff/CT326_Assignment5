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
	    
		System.out.println("Print Inventory:");
		inventory.iterator().forEachRemaining(System.out::println);
		
		ShoppingCart cart1 = new ShoppingCart("Mark F", "23/10/2019");
		cart1.availableInventory(inventory);
		cart1.searchInventory("Apple");
		cart1.addItem("Apple", 2);
		cart1.addItem("Orange", 5);
		cart1.addItem("Milk", 2);
		cart1.addItem("Blue Cheese", 4);
		cart1.addItem("Candy", 25);
		cart1.removeItem("Candy", 5);
		
		cart1.toString();
		
	}
}
