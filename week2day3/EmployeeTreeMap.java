import java.util.*;

public class EmployeeTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> employees = new TreeMap<>();

        employees.put(1, "Ruman");
        employees.put(5, "Afseen");
        employees.put(8, "Falak");
        employees.put(2, "Shabana");

        System.out.println("Employees (automatically sorted):");
        for (Integer id : employees.keySet()) {
            System.out.println(id + " -> " + employees.get(id));
        }
    }
}