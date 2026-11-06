interface NumberPrinter {
    void printNumber(Integer num);
}

class MyNumberPrinter implements NumberPrinter {
    @Override
    public void printNumber(Integer num) {
        System.out.println("The printed number is: " + num);
    }
}

public class test4 {
    public static void main(String[] args) {
        NumberPrinter np = new MyNumberPrinter();
        np.printNumber(42);
        np.printNumber(100);
    }
}

