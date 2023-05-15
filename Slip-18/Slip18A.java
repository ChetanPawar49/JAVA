public class Slip18A //Slip15A
{ 
    public static void main(String[] args)
    { 
        Thread thread = Thread.currentThread(); 
        System.out.println("Thread Name: " + thread.getName()); 
        System.out.println("Thread Priority: " + thread.getPriority()); 
    } 
} 