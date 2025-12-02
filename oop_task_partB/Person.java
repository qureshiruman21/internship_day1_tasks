public class Person implements Printable {

    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Method to override (Polymorphism)
    public void work() {
        System.out.println(name + " is doing some work.");
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public void printDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}
