import java.util.Iterator; 
import java.util.LinkedList; 
import java.util.Scanner; 

public class Slip21A
{ 
    public static void main(String[] args)
    { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number of subjects: "); 
        int n = sc.nextInt(); 
        LinkedList<String> subjects = new LinkedList<String>(); 
        System.out.println("Enter the subject names:"); 
        for (int i = 0; i < n; i++)
        { 
            String subject = sc.next(); 
            subjects.add(subject); 
        } 
        System.out.println("Subject names:"); 
        Iterator<String> iterator = subjects.iterator(); 
        while (iterator.hasNext())
        { 
            String subject = iterator.next(); 
            System.out.println(subject); 
        } 
    } 
} 