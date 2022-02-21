import java.util.*;

public class Collections_Q1 {

    public static void main(String[] args) {
        
        List<String> argList = Arrays.asList(args);  
        Collections.shuffle(argList); 

        argList.stream()
        .forEach(e->System.out.format("%s ",e)); //foreach loop

        for (String arg: argList) {
            System.out.format("%s ", arg);
        }

        System.out.println();
    }
}