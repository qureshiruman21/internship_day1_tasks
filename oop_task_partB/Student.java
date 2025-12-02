public class Student extends Person {

    private String course;

    public Student(int id, String name, int age, String course) {
        super(id, name, age);
        this.course = course;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is studying for course: " + course);
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Course: " + course);
    }
}
