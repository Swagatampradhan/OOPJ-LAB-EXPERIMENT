interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

public class test2 {
    public static void main(String[] args) {
        Drawable ref;

        ref = new Circle();
        ref.draw();

        ref = new Rectangle();
        ref.draw();
    }
}

