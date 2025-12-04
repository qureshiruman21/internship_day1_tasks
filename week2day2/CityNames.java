import java.util.*;

public class CityNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashSet<String> cities = new LinkedHashSet<>();

        System.out.println("Enter 5 city names (duplicates allowed):");

        for (int i = 1; i <= 5; i++) {
            System.out.print("City " + i + ": ");
            cities.add(sc.nextLine());
        }

        System.out.println("\nCities (Order Preserved, No Duplicates):");
        System.out.println(cities);

        sc.close();
    }
}
