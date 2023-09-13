package pl.globallogic.intermediate.zad36;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = (height < 0) ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 8.0);
        System.out.println("Rectangle Width: " + rectangle.getWidth());
        System.out.println("Rectangle Length: " + rectangle.getLength());
        System.out.println("Rectangle Area: " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(3.0, 4.0, 7.0);
        System.out.println("Cuboid Width: " + cuboid.getWidth());
        System.out.println("Cuboid Length: " + cuboid.getLength());
        System.out.println("Cuboid Height: " + cuboid.getHeight());
        System.out.println("Cuboid Volume: " + cuboid.getVolume());
    }
}
