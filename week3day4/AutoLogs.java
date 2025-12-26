import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class AutoLogs {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("log.txt", true))) {

            for (int i = 1; i <= 25; i++) {
                bw.write(LocalDateTime.now() + " INFO Application running");
                bw.newLine();
            }

            for (int i = 1; i <= 15; i++) {
                bw.write(LocalDateTime.now() + " WARN Low memory");
                bw.newLine();
            }

            for (int i = 1; i <= 10; i++) {
                bw.write(LocalDateTime.now() + " ERROR System failure");
                bw.newLine();
            }

            System.out.println("50 logs generated successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
