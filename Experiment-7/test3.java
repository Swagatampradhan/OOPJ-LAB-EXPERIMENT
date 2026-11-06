import mathops.Operations;

public class test3 {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        System.out.println("--- Mathematical Operations from 'mathops' Package ---");
        System.out.println("Operand 1: " + a + ", Operand 2: " + b);
        System.out.println("Addition       : " + Operations.add(a, b));
        System.out.println("Subtraction    : " + Operations.subtract(a, b));
        System.out.println("Multiplication : " + Operations.multiply(a, b));
        System.out.println("Division       : " + Operations.divide(a, b));
    }
}

