import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Task1_Iterator {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println("---- Using Iterator ----");
        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\n---- Using For-each Loop ----");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("\n---- Using ListIterator (Reverse) ----");
        ListIterator<String> li = list.listIterator(list.size());

        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}
