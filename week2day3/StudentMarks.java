import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> marksMap = new HashMap<>();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        marksMap.put(roll, marks);  // insert
        System.out.println("Stored!");

        // Update marks (overwriting)
        System.out.println("\nUpdate marks for same roll number:");
        System.out.print("Enter new marks: ");
        int newMarks = sc.nextInt();
        marksMap.put(roll, newMarks);

        System.out.print("\nSearch roll number: ");
        int search = sc.nextInt();

        if (marksMap.containsKey(search)) {
            System.out.println("Marks = " + marksMap.get(search));
        } else {
            System.out.println("Roll number not found!");
        }

        System.out.println("\nFull HashMap (random order):");
        System.out.println(marksMap);
    }
}