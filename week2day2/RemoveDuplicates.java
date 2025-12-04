import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Aman","Neha","Aman","Rohit","Neha","Sahil","Aman");

        System.out.println("Original List: " + names);

        Set<String> uniqueNames = new HashSet<>(names);

        System.out.println("Unique Set: " + uniqueNames);

        List<String> newList = new ArrayList<>(uniqueNames);
        System.out.println("List After Removing Duplicates: " + newList);
    }
}
