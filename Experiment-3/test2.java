class Calculator {
    public static double power(int num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static double power(double num1, double num2) {
        return Math.pow(num1, num2);
    }
}

public class test2 {
    public static void main(String[] args) {
        int intBase = 2, intExp = 5;
        double dBase = 2.5, dExp = 3.0;

        System.out.println(intBase + " ^ " + intExp + " (int method) = " + (long) Calculator.power(intBase, intExp));
        System.out.println(dBase + " ^ " + dExp + " (double method) = " + Calculator.power(dBase, dExp));
    }
}

