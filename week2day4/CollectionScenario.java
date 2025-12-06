import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.LinkedHashMap;
import java.util.PriorityQueue;

public class CollectionScenario {
    public static void main(String[] args) {

        // 1. Scenario: Maintain order of attendance list
        LinkedList<String> attendance = new LinkedList<>();
        attendance.add("Ruman");
        attendance.add("Siya");
        attendance.add("Mariyam");

        System.out.println(attendance);

        // 2. Scenario: Remove duplicates from exam submissions
        HashSet<String> submissions = new HashSet<>();
        submissions.add("file1.pdf");
        submissions.add("file1.pdf"); // duplicate ignored
        submissions.add("file2.pdf"); // duplicate ignored


        System.out.println(submissions);


        // 3. Scenario: College timetable → sorted by time
        TreeMap<String, String> timetable = new TreeMap<>();
        timetable.put("09:00", "EVS");
        timetable.put("11:00", "Physics");
        timetable.put("10:00", "Chemistry");

        System.out.println(timetable);

        // 4. Scenario: Student roll number & name lookup
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Rimsha");
        studentMap.put(102, "Reshma");

        System.out.println(studentMap.get(101));

        // 5. Scenario: Manage print queue jobs
        Queue<String> printQueue = new LinkedList<>();
        printQueue.add("Job1");
        printQueue.add("Job2");

        System.out.println(printQueue.poll()); // prints Job1

        // 6. Scenario: Keep browser back–forward history
        Stack<String> history = new Stack<>();
        history.push("Instagram");
        history.push("Youtube");
        history.push("Snapchat");

        System.out.println(history.pop()); // Settings

        // 7. Scenario: Store leaderboard scores sorted
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(90);
        scores.add(75);
        scores.add(80);

        System.out.println(scores);

        // 8. Scenario: Store products in ecommerce
        ArrayList<String> products = new ArrayList<>();
        products.add("Laptop");
        products.add("Shoes");
        products.add("Mobile");

        System.out.println(products);

        // 9. Scenario: Cache with insertion order
        LinkedHashMap<Integer, String> cache = new LinkedHashMap<>();
        cache.put(1, "Data A");
        cache.put(2, "Data B");

        System.out.println(cache);

        // 10. Scenario: Manage tasks by priority
        PriorityQueue<Integer> tasks = new PriorityQueue<>();
        tasks.add(5); // low priority
        tasks.add(1); // high priority

        System.out.println(tasks.poll()); // 1

    }
}