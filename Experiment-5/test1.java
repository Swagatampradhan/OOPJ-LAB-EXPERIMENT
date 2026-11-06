interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

public class test1 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();
    }
}

