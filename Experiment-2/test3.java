import java.util.Arrays;

public class test3 {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        Arrays.sort(arr);

        System.out.print("Sorted array: ");
        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
        System.out.println("First smallest: " + arr[0] + ", Second smallest: " + arr[1]);
        System.out.println("First largest: " + arr[arr.length - 1] + ", Second largest: " + arr[arr.length - 2]);
    }
}

