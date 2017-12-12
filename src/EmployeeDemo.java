package src;

import java.sql.*;


public class EmployeeDemo {

    public static void main(String[] args) {

        try{
            //1. Get a connection to database// url, user, password//
            Connection myConn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/customer",
                    "root","root"
            );
            System.out.println("Connected to database");

            //2. Create a statement
            Statement myStmt = myConn.createStatement();
               String sql = "select * from user_summery";
            //3. Execute SQL Query
            ResultSet myRs = myStmt.executeQuery("select * from user_summery");

            //4. Process the Result Set
            while(myRs.next()){
                System.out.println(myRs.getString("customer_id") + ", " +
                myRs.getString("customer_name") + ", " +
                        myRs.getString("total_purchase"));}
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
