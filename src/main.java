import java.sql.*;

public class main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "developer";
        String password = "passwordhere";

        try{
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            statement.executeUpdate("ALTER TABLE students ADD COLUMN country VARCHAR(30);");
            statement.executeUpdate("UPDATE students SET country = 'Italy' WHERE  student_id <= 2");
            statement.executeUpdate("UPDATE students SET country = 'Germany' WHERE  student_id > 2");

            statement.close();
            connection.close();


        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
