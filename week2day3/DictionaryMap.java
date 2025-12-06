import java.util.*;

public class DictionaryMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> dictionary = new HashMap<>();

        System.out.println("Enter 5 words and their meanings:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Word " + i + ": ");
            String word = sc.nextLine();
            System.out.print("Meaning: ");
            String meaning = sc.nextLine();
            dictionary.put(word, meaning);
        }

        System.out.print("\nSearch a word: ");
        String search = sc.nextLine();

        if (dictionary.containsKey(search)) {
            System.out.println("Meaning: " + dictionary.get(search));
        } else {
            System.out.println("Word not found in the dictionary");
        }
    }
}