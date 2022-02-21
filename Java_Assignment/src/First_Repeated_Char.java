import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class First_Repeated_Char {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //Take user input
        System.out.print("Enter the string : ");
        String input = sc.next();
        input = input.toLowerCase(); //Convert to lowercase char

        Map<Integer, Long> chars = input.codePoints().mapToObj(cp -> cp) //Create a map
    .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

  int pos = chars.entrySet().stream().filter(e -> e.getValue() > 1L).findFirst().map(Map.Entry::getKey)
    .orElse(Integer.valueOf(Character.MIN_VALUE));

    System.out.println(String.valueOf(Character.toChars(pos)));
    }    
}