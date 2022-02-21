
import java.util.*;

public class ListTrim {
    static void listTrim(List<String> strings) {
        for (ListIterator<String> lit = strings.listIterator(); lit.hasNext(); ) { //iterating through loop
            lit.set(lit.next().trim());
        }
    }

    public static void main(String[] args) {
        List<String> l = Arrays.asList(" hello ", " world ", " hey ");
        listTrim(l);
        for (String s : l) {
            System.out.format("\"%s\"%n", s);
        }
    }
}