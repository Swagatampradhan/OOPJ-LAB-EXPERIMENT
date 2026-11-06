public class test1 {
    public static void main(String[] args) {
        int[] arr = {25, 14, 56, 15, 36, 77, 18, 29, 49};
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.print("Array elements: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}

