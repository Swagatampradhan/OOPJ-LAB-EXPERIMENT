public class test5 {
    public static void main(String[] args) {
        System.out.println("--- Case 1: Exception occurs and is handled ---");
        try {
            int data = 25 / 0;
            System.out.println("Data: " + data);
        } catch (ArithmeticException e) {
            System.out.println("Catch block: Exception handled -> " + e.getMessage());
        } finally {
            System.out.println("Finally block: This block always executes regardless of exception.");
        }

        System.out.println("\n--- Case 2: No exception occurs ---");
        try {
            int data = 25 / 5;
            System.out.println("Data: " + data);
        } catch (ArithmeticException e) {
            System.out.println("Catch block: Exception handled -> " + e.getMessage());
        } finally {
            System.out.println("Finally block: Executed even when no exception occurs.");
        }
    }
}

