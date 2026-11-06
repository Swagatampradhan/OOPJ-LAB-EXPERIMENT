class Box {
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double getVolume() {
        return width * height * depth;
    }
}

public class test1 {
    public static void main(String[] args) {
        Box myBox = new Box(10.0, 5.0, 4.0);
        System.out.println("Box Dimensions: Width = " + myBox.width + ", Height = " + myBox.height + ", Depth = " + myBox.depth);
        System.out.println("Volume of the box: " + myBox.getVolume());
    }
}

