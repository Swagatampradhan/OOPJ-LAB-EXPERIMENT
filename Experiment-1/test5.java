public class test5 {
    public static void main(String[] args) {
        System.out.println("First 5 values divisible by 2, 3, and 5:");
        int count = 0;
        int num = 1;
        while (count < 5) {
            if (num % 2 == 0 && num % 3 == 0 && num % 5 == 0) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }
}

