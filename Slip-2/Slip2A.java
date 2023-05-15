import java.util.*;

public class Slip2A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of friends: ");
        int n = scanner.nextInt();
        
        Set<String> friendsSet = new HashSet<>();
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter name of friend " + i + ": ");
            String name = scanner.next();
            friendsSet.add(name);
        }
        
        Set<String> sortedSet = new TreeSet<>(friendsSet);
        
        System.out.println("List of friends in ascending order:");
        for (String name : sortedSet) {
            System.out.println(name);
        }
    }
}