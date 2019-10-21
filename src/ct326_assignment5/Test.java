package ct326_assignment5;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		List<Inventory> inventory = null;
//		Inventory inventory;
		Inventory i1 = new Inventory("1000", "Apple", 30, 2.50);
		Inventory i2 = new Inventory("1001", "Orange", 40, 2);
		Inventory i3 = new Inventory("2001", "Milk", 10, 2.39);
		Inventory i4 = new Inventory("2002", "Orange Juice", 20, 1.99);
		Inventory i5 = new Inventory("3001", "Blue Cheese", 10, 2.25);
		Inventory i6 = new Inventory("3002", "Cheddar", 20, 2.79);
		Inventory i7 = new Inventory("4001", "Chocolate", 40, 2.99);
		Inventory i8 = new Inventory("4002", "Candy", 30, 0.99);
		Inventory i9 = new Inventory("5001", "Beef", 10, 5.00);
		Inventory i10 = new Inventory("5002", "Chicken", 10, 4.00);
		
		inventory.add(inventory.size(), i1);
		
		
//		 new Inventory("1000", "Apple", 30, 2.50);
//		 new Inventory("1001", "Orange", 40, 2);
//		 new Inventory("2001", "Milk", 10, 2.39);
//		 new Inventory("2002", "Orange Juice", 20, 1.99);
//		 new Inventory("3001", "Blue Cheese", 10, 2.25);
//		 new Inventory("3002", "Cheddar", 20, 2.79);
//		 new Inventory("4001", "Chocolate", 40, 2.99);
//		 new Inventory("4002", "Candy", 30, 0.99);
//		 new Inventory("5001", "Beef", 10, 5.00);
//		 new Inventory("5002", "Chicken", 10, 4.00);
		 
		System.out.println(inventory.toString());
	}

}
