package pl.globallogic.basic.zad9;

public class areaChecker {
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        return x * y;
    }

    public static void main(String[] args) {
        double circleArea = area(3.0);
        double invalidCircleArea = area(-1.0);
        double rectangleArea = area(5.0, 4.0);
        double invalidRectangleArea = area(-1.0, 4.0);

        System.out.println("Circle area: " + circleArea);
        System.out.println("Invalid circle area: " + invalidCircleArea);
        System.out.println("Rectangle area: " + rectangleArea);
        System.out.println("Invalid rectangle area: " + invalidRectangleArea);
    }
}
