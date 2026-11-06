import pack1.AccessDemo;

class SubClass extends AccessDemo {
    void showProtected() {
        System.out.println("Accessing protected variable via inheritance in subclass: " + protVar);
    }
}

public class test2 {
    public static void main(String[] args) {
        AccessDemo demo = new AccessDemo();
        demo.showAll();

        System.out.println("\nAccessing from outside the package (test2):");
        System.out.println("public variable: " + demo.pubVar);

        SubClass sub = new SubClass();
        sub.showProtected();

        System.out.println("Note: 'default' and 'private' variables are not accessible outside the package.");
    }
}

