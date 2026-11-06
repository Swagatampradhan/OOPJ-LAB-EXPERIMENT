interface Vehicle {
    void start();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with a key ignition: Vroom Vroom!");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starts with self-start or kick: Zoom Zoom!");
    }
}

public class test6 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        bike.start();
    }
}

