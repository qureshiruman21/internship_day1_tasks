import java.io.FileReader;

public class ReadWithFileReader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("filehandling/sample.txt");
            int ch;

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
