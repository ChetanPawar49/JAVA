import java.sql.*; 
public class Slip26A
{ 
    public static void main(String[] args) { 
        try { 
        // Step 1: Load the JDBC driver 
            Class.forName("com.mysql.jdbc.Driver"); 
            
            // Step 2: Establish the connection to the database 
            String url = "jdbc:mysql://localhost:3306/yourdatabase"; 
            String username = "yourusername"; 
            String password = "yourpassword"; 
            Connection con = DriverManager.getConnection(url, username, 
            password); 
            
            // Step 3: Create a prepared statement to delete the employee details 
            PreparedStatement pstmt = con.prepareStatement("DELETE FROM Employee WHERE ENo=?"); 
            
            // Step 4: Set the employee ID parameter for the prepared statement 
            int employeeID = Integer.parseInt(args[0]); 
            pstmt.setInt(1, employeeID); 
            
            // Step 5: Execute the prepared statement 
            int rowsAffected = pstmt.executeUpdate(); 
            System.out.println(rowsAffected + " row(s) deleted."); 
            
            // Step 6: Close the resources 
            pstmt.close(); 
            con.close(); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    } 
}