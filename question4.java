import java.util.HashMap;

public class question4{
    public static void main(String[] args) {
        // Create a HashMap to store car models and their prices
        HashMap<String, Double> carPrices = new HashMap<>();

        // Adding car models and their prices to the HashMap
        carPrices.put("Toyota Camry", 24000.00);
        carPrices.put("Honda Accord", 26000.00);
        carPrices.put("Ford Mustang", 35000.00);
        carPrices.put("Chevrolet Malibu", 23000.00);

        // Accessing values using car models
        System.out.println("Price of Toyota Camry: $" + carPrices.get("Toyota Camry"));
        System.out.println("Price of Honda Accord: $" + carPrices.get("Honda Accord"));

        // Check if a car model exists
        String modelToCheck = "Ford Mustang";
        if (carPrices.containsKey(modelToCheck)) {
            System.out.println("Price of " + modelToCheck + ": $" + carPrices.get(modelToCheck));
        }

        // Iterate through the HashMap
        System.out.println("\nAll car prices:");
        for (String model : carPrices.keySet()) {
            System.out.println(model + ": $" + carPrices.get(model));
        }
    }
}
