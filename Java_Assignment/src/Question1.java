import java.security.KeyStore.Entry;
import java.util.*;

public class Question1{
    public static void main(String[] args){
        Map<Integer, String> languages = new HashMap<Integer, String>(); //Mapping
        languages.put(1, "Python");
        languages.put(2, "Js");
        languages.put(3, "Node Js");
       


        // Iterate using forEach loop
        System.out.println("\nIteration using advanced forEach loop");
        languages.forEach((key, value)->{
            System.out.println("Key = " + key + ", Value = "+ value);
        });

        // Iterate using while loop
        System.out.println("\nIteration using While loop");
        Iterator <Integer> itr = languages.keySet().iterator();        
        while(itr.hasNext()){
            int key = (int)itr.next();
            System.out.println("Key = " + key + ", Value = "+ languages.get(key));

        }
    }
}