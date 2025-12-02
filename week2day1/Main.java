import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n--- Student CRUD Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Show Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    manager.addStudent(new Student(id, name, course));
                    break;

                case 2:
                    manager.showStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    Student s = manager.searchStudent(sc.nextInt());
                    System.out.println(s != null ? s : "Student Not Found");
                    break;

                case 4:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("New Course: ");
                    String newCourse = sc.nextLine();

                    manager.updateStudent(uid, newName, newCourse);
                    break;

                case 5:
                    System.out.print("Enter ID to delete: ");
                    manager.deleteStudent(sc.nextInt());
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
