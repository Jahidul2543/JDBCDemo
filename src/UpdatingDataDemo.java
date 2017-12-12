package src;

import java.sql.*;

public class UpdatingDataDemo {

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
            String sql = "update user_summery"
                    + " set customer_name=jiii"
                    + " where customer_id=1";

            myStmt.executeUpdate(sql);
            System.out.println("Update complete");

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}


