import java.util.*;

public class AttendanceLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> attendance = new LinkedHashMap<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 students (roll number + name):");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Roll: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            // No duplicates
            attendance.putIfAbsent(roll, name);
        }

        System.out.println("\nAttendance (in order entered):");
        for (Integer r : attendance.keySet()) {
            System.out.println(r + " -> " + attendance.get(r));
        }

        System.out.print("\nSearch roll number: ");
        int search = sc.nextInt();

        if (attendance.containsKey(search)) {
            System.out.println("Student: " + attendance.get(search));
        } else {
            System.out.println("Not found.");
        }
    }
}