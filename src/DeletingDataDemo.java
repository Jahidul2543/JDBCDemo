package src;

import java.sql.*;

public class DeletingDataDemo {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/customer";
        String user = "root";
        String pass = "root";

        try{
            //1. Get a connection to database
            Connection myConn = DriverManager.getConnection(url, user, pass);

            //2. Create a statement
            Statement myStmt = myConn.createStatement();

            //3. Execute the SQL Query
            String sql = "delete from user_summery where customer_id=2";

            int rowsAffected = myStmt.executeUpdate(sql);

            System.out.println("Rows affected: " + rowsAffected);

            System.out.println("Delete complete");



        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
        }
    }

}
