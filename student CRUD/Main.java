import java.sql.*;

public class Main {
    public static void main(String[] args) {

        Connection con = null;

        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/internship_day1";
            String user = "postgres";
            String pass = "ruman";

            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected Successfully!");

            StudentDAO dao = new StudentDAO(con);

            // INSERT
            dao.insertStudent("Aman", "aman@gmail.com", 1);
            dao.insertStudent("Rimsha", "rimsha@gmail.com", 2);
            dao.insertStudent("Neha", "neha@gmail.com", 3);

            // SELECT
            dao.getAllStudents();

            // UPDATE
            dao.updateStudent(1, "Aman Updated");

            // DELETE
            dao.deleteStudent(3);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
