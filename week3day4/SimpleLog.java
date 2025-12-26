import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SimpleLog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter log message: ");
        String message = sc.nextLine();

        try (FileWriter fw = new FileWriter("log.txt", true)) {
            fw.write(message + "\n");
            System.out.println("Log written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
