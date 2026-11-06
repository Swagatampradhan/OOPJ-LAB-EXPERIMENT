import java.util.Scanner;

public class test5 {
    public static String withoutFirstAndLast(String str) {
        if (str == null || str.length() <= 2) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = withoutFirstAndLast(str);
        System.out.println("String without first and last characters: \"" + result + "\"");
        sc.close();
    }
}

