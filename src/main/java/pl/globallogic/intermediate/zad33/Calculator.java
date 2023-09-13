package pl.globallogic.intermediate.zad33;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }

    public static void main(String[] args) {
        Floor room = new Floor(12.0, 10.0);
        Carpet carpet = new Carpet(8.0);
        Calculator calculator = new Calculator(room, carpet);

        double totalCost = calculator.getTotalCost();
        System.out.println("Total Cost: $" + totalCost);
    }
}
