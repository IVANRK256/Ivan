import java.util.ArrayList;

public class question2{
    public static void main(String[] args) {
        // Create an ArrayList to store String elements
        ArrayList<String> animal = new ArrayList<>();

        // Add elements to the ArrayList
        animal.add("cow");
        animal.add("goat");
        animal.add("dog");
        animal.add("Donkey");
        animal.add("cat");

        // Display the elements of the ArrayList
        System.out.println("animal in the ArrayList:");
        for (String animals: animal) {
            System.out.println(animals);
        }
    }
}
