interface Greetings {
    void sayHello();

    default void sayBye() {
        System.out.println("Goodbye! Have a nice day.");
    }
}

class PersonGreeting implements Greetings {
    @Override
    public void sayHello() {
        System.out.println("Hello! Welcome to Java Programming.");
    }
}

public class test3 {
    public static void main(String[] args) {
        Greetings g = new PersonGreeting();
        g.sayHello(); // Abstract method
        g.sayBye();   // Default method
    }
}

