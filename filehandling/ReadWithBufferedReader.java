import java.io.BufferedReader;
import java.io.FileReader;

public class ReadWithBufferedReader {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("filehandling/sample.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
