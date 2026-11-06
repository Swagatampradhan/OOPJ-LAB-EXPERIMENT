import java.util.Scanner;

public class test3 {
    public static String repeatFirstTwo(String str) {
        if (str == null) return null;
        int n = str.length();
        String firstTwo = n < 2 ? str : str.substring(0, 2);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(firstTwo);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = repeatFirstTwo(str);
        System.out.println("Result: " + result);
        sc.close();
    }
}

