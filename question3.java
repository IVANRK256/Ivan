import java.util.HashSet;

public class question3 {
    public static void main(String[] args) {
        // Create a HashSet to store unique elements
        HashSet<String> student = new HashSet<>();

        // Add elements to the HashSet
        student.add("Apollo");
        student.add("Banbas");
        student.add("Charity");
        student.add("Abel");
        student.add("Edger");

        // Attempt to add duplicate elements
        boolean isAdded = student.add("Apollo"); // This will return false
        System.out.println("Was 'Apollo' added again? " + isAdded);

        // Display the elements of the HashSet
        System.out.println("students in the HashSet:");
        for (String student : student) {
            System.out.println(student);
        }
        
        // Check the size of the HashSet
        System.out.println("Total unique student.: " + student.size());
    }
}
