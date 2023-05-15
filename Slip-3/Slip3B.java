import java.util.*; //Slip29B

public class Slip3B {
    public static void main(String[] args) {
        // Create a LinkedList of String objects
        LinkedList<String> list = new LinkedList<>();

        // Add element at the end of the list
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");
        System.out.println("LinkedList after adding elements: " + list);

        // Delete first element of the list
        list.removeFirst();
        System.out.println("LinkedList after deleting first element: " + list);

        // Display the contents of list in reverse order
        System.out.print("LinkedList in reverse order: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
