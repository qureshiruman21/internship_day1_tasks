import java.util.*;

public class SortedProductPrices {
    public static void main(String[] args) {

        TreeSet<Double> prices = new TreeSet<>();

        prices.add(499.99);
        prices.add(99.50);
        prices.add(899.00);
        prices.add(150.49);
        prices.add(99.50); // duplicate ignored

        System.out.println("Sorted Product Prices (TreeSet):");
        System.out.println(prices);
    }
}
