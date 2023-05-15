import java.sql.*; //Slip11B
public class Slip29A
{ 
    public static void main(String[] args) { 
        String url = "jdbc:mysql://localhost:3306/mydb"; // replace mydb with your database name 
        String username = "root"; // replace root with your MySQL username 
        String password = "password"; // replace password with your MySQL password 
        
        try (Connection con = DriverManager.getConnection(url, username, password)) { 
            String query = "SELECT * FROM DONAR"; 
            PreparedStatement ps = con.prepareStatement(query); 
            ResultSet rs = ps.executeQuery(); 
            
            ResultSetMetaData rsmd = rs.getMetaData(); 
            int columnCount = rsmd.getColumnCount(); 
            
            System.out.println("Column Name\t\tData Type"); 
            System.out.println("------------------------------------------"); 
            
            for (int i = 1; i <= columnCount; i++) { 
                String columnName = rsmd.getColumnName(i); 
                String dataType = rsmd.getColumnTypeName(i); 
                System.out.println(columnName + "\t\t\t" + dataType); 
            } 
        } catch (SQLException e) { 
            System.out.println("Error: " + e.getMessage()); 
        } 
    } 
}