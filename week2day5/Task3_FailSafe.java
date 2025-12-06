import java.util.concurrent.CopyOnWriteArrayList;

public class Task3_FailSafe {
    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<>();
        numbers.add(1);
        numbers.add(2);

        for (Integer n : numbers) {
            System.out.println(n);
            numbers.add(3); // Allowed (no exception)
        }

        System.out.println("Final List: " + numbers);
    }
}