public class Main {
    public static void main(String[] args) {

        Person p = new Person(1, "Rimsha", 25);
        Student s = new Student(2, "Ruman", 19, "Computer Science");
        Employee e = new Employee(3, "Mariyam", 16, "IT");

        p.work();
        s.work();
        e.work();

        p.printDetails();
        s.printDetails();
        e.printDetails();
    }
}
