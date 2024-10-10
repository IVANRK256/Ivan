public class question5 {
    public static <M> void displayArray(M[] array) {
        for (M element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {21, 52, 37, 49, 59};
        System.out.println("Integer Array:");
        displayArray(intArray);

        String[] strArray = {"hen", "dove", "eagle"};
        System.out.println("\nString Array:");
        displayArray(strArray);

        Double[] doubleArray = {1.00, 1.2004, 3.003};
        System.out.println("\nDouble Array:");
        displayArray(doubleArray);
    }
}
