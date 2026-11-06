import java.util.Scanner;

public class test6 {
    public static String repeatLastN(String str, int n) {
        if (str == null || n <= 0) return "";
        if (n > str.length()) n = str.length();

        String lastN = str.substring(str.length() - n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(lastN);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter an integer n: ");
        int n = sc.nextInt();

        String result = repeatLastN(str, n);
        System.out.println("Result: " + result);
        sc.close();
    }
}

