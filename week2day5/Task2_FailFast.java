import java.util.ArrayList;
import java.util.Iterator;

public class Task2_FailFast {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
            list.add("new");   //  Modification while iterating → error
        }
    }
}