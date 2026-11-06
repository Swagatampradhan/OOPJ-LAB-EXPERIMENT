public class test1 {
    public static void main(String[] args) {
        if (args.length >= 2) {
            System.out.println(args[0] + " Technologies " + args[1]);
        } else {
            System.out.println("Please provide two command line arguments.");
            System.out.println("Example: java test1 Wipro Bangalore");
        }
    }
}

