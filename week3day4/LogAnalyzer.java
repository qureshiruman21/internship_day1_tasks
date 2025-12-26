import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LogAnalyzer {
    public static void main(String[] args) {

        int total = 0, info = 0, warn = 0, error = 0;
        String longestLine = "";
        String firstTimestamp = null;
        String lastTimestamp = null;

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                total++;

                if (line.contains("INFO")) info++;
                if (line.contains("WARN")) warn++;
                if (line.contains("ERROR")) error++;

                if (line.length() > longestLine.length()) {
                    longestLine = line;
                }

                String timestamp = line.split(" ")[0];
                if (firstTimestamp == null) {
                    firstTimestamp = timestamp;
                }
                lastTimestamp = timestamp;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Total logs: " + total);
        System.out.println("INFO logs: " + info);
        System.out.println("WARN logs: " + warn);
        System.out.println("ERROR logs: " + error);
        System.out.println("Longest log line: " + longestLine);
        System.out.println("First timestamp: " + firstTimestamp);
        System.out.println("Last timestamp: " + lastTimestamp);
    }
}
