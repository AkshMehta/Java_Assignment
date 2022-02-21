
import java.util.*; 

class Count_Word {

	public static void main(String args[]) {
	
	Map < String, Integer > map = new HashMap < > (); //Create a hashmap
	
	Scanner sc = new Scanner(System.in); //Take user input
	
	System.out.println("Enter a string:");
	
	String sentence = sc.nextLine();
	
	String[] tokens = sentence.split(" "); //Split the string
	
	for (String token: tokens) {
	
	String word = token.toLowerCase();
	
	if (map.containsKey(word)) {
	
	int count = map.get(word); 
	
	map.put(word, count + 1); 
	
	} else {
	
	map.put(word, 1); 
	
	}
	
	}
	
	
	
	Set < String > keys = map.keySet(); //Set
	
	TreeSet < String > sortedKeys = new TreeSet < > (keys); 
	
	for (String str: sortedKeys) {
	
	System.out.println("Word : " + str + " and it's count : " + map.get(str));
	
	}
	
	}
	
	}