
import java.util.*;
public class Loops {
   public static void main(String[] args) {

      ArrayList<Integer> arrlist = new ArrayList<Integer>();
      arrlist.add(20);
      arrlist.add(17);
      arrlist.add(34);
      arrlist.add(50);

      /* For Loop for iterating ArrayList */
      System.out.println("For Loop");
      for (int counter = 0; counter < arrlist.size(); counter++) { 		      
          System.out.println(arrlist.get(counter)); 		
      }   
      
      /* While Loop for iterating ArrayList*/ 		
      System.out.println("While Loop"); 		
      int count = 0; 		
      while (arrlist.size() > count) {
    	 System.out.println(arrlist.get(count));
         count++;
      }
      
      /* Advanced For Loop*/ 		
      System.out.println("Advanced For Loop"); 		
      for (Integer num : arrlist) { 		      
           System.out.println(num); 		
      }


   }
}