// import java.util.ArrayList; 
// import java.util.Iterator; 
// import java.util.ListIterator; 
import java.util.*; 

public class Slip23B
{ 
    public static void main(String[] args) { 
        ArrayList<String> studentNames = new ArrayList<>(); 
        // Accept N student names through command line and add them to the ArrayList 
        for (int i = 0; i < args.length; i++) { 
            studentNames.add(args[i]); 
        } 
        // Display the student names using Iterator interface 
        System.out.println("Student names using Iterator:"); 
        Iterator<String> iterator = studentNames.iterator(); 
        while (iterator.hasNext()) { 
            System.out.println(iterator.next()); 
        } 
        // Display the student names using ListIterator interface 
        System.out.println("\nStudent names using ListIterator:"); 
        ListIterator<String> listIterator = studentNames.listIterator(); 
        while (listIterator.hasNext()) { 
            System.out.println(listIterator.next()); 
        } 
    } 
} 