class Fruit {
    String name;
    String taste;

    Fruit(String name, String taste) {
        this.name = name;
        this.taste = taste;
    }

    void eat() {
        System.out.println(name + " tastes " + taste + ".");
    }
}

class Apple extends Fruit {
    Apple() {
        super("Apple", "sweet and crisp");
    }

    @Override
    void eat() {
        System.out.println(name + " has a crunchy texture and tastes " + taste + ".");
    }
}

class Orange extends Fruit {
    Orange() {
        super("Orange", "citrusy and tangy");
    }

    @Override
    void eat() {
        System.out.println(name + " is juicy and tastes " + taste + ".");
    }
}

public class test4 {
    public static void main(String[] args) {
        Fruit generalFruit = new Fruit("Generic Fruit", "fresh");
        Apple apple = new Apple();
        Orange orange = new Orange();

        generalFruit.eat();
        apple.eat();
        orange.eat();
    }
}

