import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;

        try {

            Class.forName("org.postgresql.Driver");


            String url = "jdbc:postgresql://localhost:5432/internship_day1";
            String user = "postgres";
            String pass = "ruman";

            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected Successfully!");


            stmt = conn.createStatement();


            ResultSet rs = stmt.executeQuery("SELECT * FROM students");


            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
                System.out.println("Connection Closed.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
