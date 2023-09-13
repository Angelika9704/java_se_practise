package pl.globallogic.intermediate.zad31;

public class Wall {
    private double width;
    private double height;

    // No-arg constructor
    public Wall() {
        this.width = 0.0;
        this.height = 0.0;
    }

    // Constructor with parameters
    public Wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Wall wall1 = new Wall();
        System.out.println("Wall 1 Area: " + wall1.getArea()); // Output: 0.0

        Wall wall2 = new Wall(5.0, 3.0);
        System.out.println("Wall 2 Area: " + wall2.getArea()); // Output: 15.0

        wall2.setWidth(-1.0);
        wall2.setHeight(2.0);
        System.out.println("Updated Wall 2 Area: " + wall2.getArea()); // Output: 0.0
    }
}
