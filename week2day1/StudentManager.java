import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> list = new ArrayList<>();

    // CREATE
    public void addStudent(Student s) {
        list.add(s);
        System.out.println("Student Added Successfully!");
    }

    // READ - SHOW ALL
    public void showStudents() {
        System.out.println("\n--- Student List ---");
        for (Student s : list) {
            System.out.println(s);
        }
    }

    // SEARCH
    public Student searchStudent(int id) {
        for (Student s : list) {
            if (s.getId() == id)
                return s;
        }
        return null;
    }

    // UPDATE
    public void updateStudent(int id, String newName, String newCourse) {
        Student s = searchStudent(id);
        if (s != null) {
            s.setName(newName);
            s.setCourse(newCourse);
            System.out.println("Student Updated Successfully!");
        } else {
            System.out.println("Student Not Found!");
        }
    }

    // DELETE
    public void deleteStudent(int id) {
        Student s = searchStudent(id);
        if (s != null) {
            list.remove(s);
            System.out.println("Student Deleted Successfully!");
        } else {
            System.out.println("Student Not Found!");
        }
    }
}
