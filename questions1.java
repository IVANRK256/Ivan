import java.util.ArrayList;

public class question1{
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // access the element 
        System.out.println("1: " + list.get(0)); // Apple
        System.out.println("2: " + list.get(1)); // Banana
        System.out.println("3:"+list.get(2)); // Cherry

        // Remove elements
        list.remove(1); // Removes "Banana"
        list.remove("Apple"); // Removes "Apple"

        // Iterate through the ArrayList
        for (String fruit : list) {
            System.out.println(fruit); // Cherry
        }
    }
}
