package pl.globallogic.intermediate.zad35;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = (height < 0) ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle Radius: " + circle.getRadius());
        System.out.println("Circle Area: " + circle.getArea());

        Cylinder cylinder = new Cylinder(3.0, 7.0);
        System.out.println("Cylinder Radius: " + cylinder.getRadius());
        System.out.println("Cylinder Height: " + cylinder.getHeight());
        System.out.println("Cylinder Volume: " + cylinder.getVolume());
    }
}

