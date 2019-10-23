package ct326_assignment5;

import java.util.*;

public class CollectionsDemo {
   public static void main(String args[]) {
   
      // create arraylist       
      ArrayList<String> arlst = new ArrayList<String>();

      // populate the list
      arlst.add("TP");
      arlst.add("PROVIDES");
      arlst.add("QUALITY");
      arlst.add("TUTORIALS");

      // search the list for key 'QUALITY'
      int index = Collections.binarySearch(arlst, "QUALITY");     

      System.out.println("'QUALITY' is available at index: "+index);
   }    
}