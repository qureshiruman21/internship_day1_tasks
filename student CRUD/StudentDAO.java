import java.sql.*;

public class StudentDAO {

    private Connection con;

    public StudentDAO(Connection con) {
        this.con = con;
    }

    // CREATE - Insert Student
    public void insertStudent(String name, String email, int deptId) throws Exception {
        String query = "INSERT INTO students(name, email, dept_id) VALUES(?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, name);
        ps.setString(2, email);
        ps.setInt(3, deptId);
        ps.executeUpdate();
        System.out.println("Student Inserted Successfully!");
    }

    // READ - Get All Students
    public void getAllStudents() throws Exception {
        String query = "SELECT * FROM students";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        System.out.println("ID | Name | Email | Dept ID");
        System.out.println("------------------------------");

        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + " | " +
                            rs.getString("name") + " | " +
                            rs.getString("email") + " | " +
                            rs.getInt("dept_id")
            );
        }
    }

    // UPDATE - Update Student Name
    public void updateStudent(int id, String newName) throws Exception {
        String query = "UPDATE students SET name = ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, newName);
        ps.setInt(2, id);
        ps.executeUpdate();
        System.out.println("Student Updated Successfully!");
    }

    // DELETE - Delete Student
    public void deleteStudent(int id) throws Exception {
        String query = "DELETE FROM students WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("Student Deleted Successfully!");
    }
}
