public class Employee extends Person {

    private String department;

    public Employee(int id, String name, int age, String department) {
        super(id, name, age);
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is working in department: " + department);
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Department: " + department);
    }
}
