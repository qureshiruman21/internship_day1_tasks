import java.util.*;

class Student {
    int id;
    String name;
    String course;

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return id == s.id && name.equals(s.name) && course.equals(s.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, course);
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + course;
    }
}

public class StudentDuplicateRemoval {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1,"Aman","Java"));
        students.add(new Student(2,"Neha","Python"));
        students.add(new Student(1,"Aman","Java")); // duplicate
        students.add(new Student(3,"Rohit","C++"));
        students.add(new Student(2,"Neha","Python")); // duplicate

        System.out.println("Original List:");
        students.forEach(System.out::println);

        Set<Student> uniqueStudents = new HashSet<>(students);

        System.out.println("\nAfter Removing Duplicates (Set):");
        uniqueStudents.forEach(System.out::println);
    }
}