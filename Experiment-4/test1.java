class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }

    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class Bird extends Animal {
    @Override
    void eat() {
        System.out.println("Bird is pecking seeds.");
    }

    @Override
    void sleep() {
        System.out.println("Bird is sleeping in its nest.");
    }

    void fly() {
        System.out.println("Bird is flying in the sky.");
    }
}

public class test1 {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }
}

