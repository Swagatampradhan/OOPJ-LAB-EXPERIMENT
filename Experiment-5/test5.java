interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class MultiFunctionMachine implements Printer, Scanner {
    @Override
    public void print() {
        System.out.println("Printing document in high quality...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document to PDF format...");
    }
}

public class test5 {
    public static void main(String[] args) {
        MultiFunctionMachine mfm = new MultiFunctionMachine();
        mfm.print();
        mfm.scan();
    }
}

