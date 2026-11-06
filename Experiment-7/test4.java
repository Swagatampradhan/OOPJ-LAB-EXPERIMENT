public class test4 {
    public static void main(String[] args) {
        // Test 1: Triggering ArithmeticException
        try {
            System.out.println("Scenario 1: Division by zero");
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        // Test 2: Triggering ArrayIndexOutOfBoundsException
        try {
            System.out.println("\nScenario 2: Array index out of bounds");
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println("Element at index 10: " + numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught General Exception: " + e.getMessage());
        }

        System.out.println("\nProgram continues execution normally after handling exceptions.");
    }
}

