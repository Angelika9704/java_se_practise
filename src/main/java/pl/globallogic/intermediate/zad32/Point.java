package pl.globallogic.intermediate.zad32;

public class Point {
    private int x;
    private int y;

    // No-arg constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor with parameters
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance(Point another) {
        int xDiff = this.x - another.getX();
        int yDiff = this.y - another.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public static void main(String[] args) {
        Point point1 = new Point();
        System.out.println("Distance from Point 1 to (0,0): " + point1.distance()); // Output: 0.0

        Point point2 = new Point(3, 4);
        System.out.println("Distance from Point 2 to (0,0): " + point2.distance()); // Output: 5.0

        System.out.println("Distance between Point 1 and Point 2: " + point1.distance(point2)); // Output: 5.0
    }
}
