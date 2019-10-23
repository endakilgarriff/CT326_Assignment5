package ct326_assignment5;

import java.util.*;

public class Test {

	public static void main(String[] args) {
	
		HashMap<String,Inventory> inventory = new HashMap<String,Inventory>();
		
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
		
//		inventory.put(new Inventory("1000", "Apple\t", 30, 2.50));
//		inventory.put(new Inventory("1001", "Orange\t", 40, 2));
//		inventory.put(new Inventory("2001", "Milk\t", 10, 2.39));
//		inventory.put(new Inventory("2002", "Orange Juice", 20, 1.99));
//		inventory.put(new Inventory("3001", "Blue Cheese", 10, 2.25));
//		inventory.put(new Inventory("3002", "Cheddar\t", 20, 2.79));
//		inventory.put(new Inventory("4001", "Chocolate", 40, 2.99));
//		inventory.put(, new Inventory("4002", "Candy\t", 30, 0.99));
//		inventory.put(new Inventory("5001", "Beef\t", 10, 5.00));
//		inventory.put(new Inventory("5002", "Chicken\t", 10, 4.00));
		
//		inventory.put(inventory1.getItemName(), inventory1 	);
//		inventory.put(inventory2.getItemName(), inventory2  );
//		inventory.put(inventory3.getItemName(), inventory3  );
//		inventory.put(inventory4.getItemName(), inventory4  );
//		inventory.put(inventory5.getItemName(), inventory5  );
//		inventory.put(inventory6.getItemName(), inventory6  );
//		inventory.put(inventory7.getItemName(), inventory7  );
//		inventory.put(inventory8.getItemName(), inventory8  );
//		inventory.put(inventory9.getItemName(), inventory9  );
//	    inventory.put(inventory10.getItemName(),inventory10 );
		
		inventory.put(inventory1.getSKU(), inventory1  );
		inventory.put(inventory2.getSKU(), inventory2  );
		inventory.put(inventory3.getSKU(), inventory3  );
		inventory.put(inventory4.getSKU(), inventory4  );
		inventory.put(inventory5.getSKU(), inventory5  );
		inventory.put(inventory6.getSKU(), inventory6  );
		inventory.put(inventory7.getSKU(), inventory7  );
		inventory.put(inventory8.getSKU(), inventory8  );
		inventory.put(inventory9.getSKU(), inventory9  );
	    inventory.put(inventory10.getSKU(),inventory10 );
//		
	    // Print Inventory 
//		for(Inventory i: inventory) {
//			System.out.println(i.toString());
//		}
	    
	    System.out.println(inventory.keySet().toString());
		
		ShoppingCart cart1 = new ShoppingCart("Mark F", "23/10/2019");
		cart1.addItem("Apple", 2);
		cart1.addItem("Orange", 5);
		cart1.addItem("Milk", 2);
		cart1.addItem("Blue Cheese", 4);
		cart1.addItem("Candy", 25);
		cart1.removeItem("Candy", 5);
		
		cart1.toString();
		
	}
}
