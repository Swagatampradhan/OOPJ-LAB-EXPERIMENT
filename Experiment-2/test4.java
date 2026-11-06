import java.util.Arrays;

public class test4 {
    public static void main(String[] args) {
        int[] arr = {12, 34, 12, 45, 67, 89, 34, 90, 45};
        Arrays.sort(arr);

        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[arr.length - 1];

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }
}

