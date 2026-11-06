import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        int target = sc.nextInt();

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println(target + " is present at index " + index);
        } else {
            System.out.println(target + " is not present in the array.");
        }
        sc.close();
    }
}

