import java.io.*;
import java.util.*;

public class FileAnalyzer {
    public static void main(String[] args) {

        Set<String> uniqueWords = new HashSet<>();
        String longest = "";
        String shortest = null;

        try {
            BufferedReader br = new BufferedReader(new FileReader("filehandling/sample.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().trim().split("\\s+");

                for (String w : words) {
                    if (w.isEmpty()) continue;

                    uniqueWords.add(w);

                    // Longest word
                    if (w.length() > longest.length()) {
                        longest = w;
                    }

                    // Shortest word
                    if (shortest == null || w.length() < shortest.length()) {
                        shortest = w;
                    }
                }
            }

            br.close();

            System.out.println("Longest word: " + longest);
            System.out.println("Shortest word: " + shortest);
            System.out.println("Unique words: " + uniqueWords.size());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
