import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class TimestampLog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter log message: ");
        String message = sc.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("log.txt", true))) {
            bw.write(LocalDateTime.now() + " INFO " + message);
            bw.newLine();
            System.out.println("Timestamp log added.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

