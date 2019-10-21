package ct326_assignment5;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		List<Inventory> inventory = new ArrayList<Inventory>();
		
		Inventory inventory1 	= new Inventory("1000", "Apple\t", 30, 2.50);
		Inventory inventory2 	= new Inventory("1001", "Orange\t", 40, 2);
		Inventory inventory3 	= new Inventory("2001", "Milk\t", 10, 2.39);
		Inventory inventory4 	= new Inventory("2002", "Orange Juice", 20, 1.99);
		Inventory inventory5 	= new Inventory("3001", "Blue Cheese", 10, 2.25);
		Inventory inventory6 	= new Inventory("3002", "Cheddar\t", 20, 2.79);
		Inventory inventory7 	= new Inventory("4001", "Chocolate", 40, 2.99);
		Inventory inventory8 	= new Inventory("4002", "Candy\t", 30, 0.99);
		Inventory inventory9 	= new Inventory("5001", "Beef\t", 10, 5.00);
		Inventory inventory10	= new Inventory("5002", "Chicken\t", 10, 4.00);

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
		
		for(Inventory i: inventory) {
			System.out.println(i.toString());
		}

	}

}
