import java.util.Enumeration;
import java.util.Hashtable;

public class Slip5A {
    public static void main(String[] args) {
        // Create a Hashtable to store student details
        Hashtable<String, String> studentDetails = new Hashtable<>();

        // Add student details to the hash table
        studentDetails.put("1234567890", "John Doe");
        studentDetails.put("9876543210", "Jane Smith");
        studentDetails.put("5678901234", "Alice Johnson");

        // Display student details using Enumeration
        Enumeration<String> mobileNumbers = studentDetails.keys();
        while (mobileNumbers.hasMoreElements()) {
            // String mobileNumber = mobileNumbers.nextElement();
            // String studentName = studentDetails.get(mobileNumber);
            // System.out.println("Mobile Number: " + mobileNumber + ", Student Name: " + studentName);
            while (mobileNumbers.hasMoreElements()) { 
                // Getting key 
                String key = mobileNumbers.nextElement(); 
                // Printing key and value corresponding to that key 
                System.out.println(key + ":" + studentDetails.get(key)); 
                }  
        }
    }
}