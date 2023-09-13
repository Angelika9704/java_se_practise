package pl.globallogic.intermediate.zad29;

public class sumCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0; // Division by zero
        }
        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(10.0);
        calculator.setSecondNumber(5.0);

        System.out.println("First Number: " + calculator.getFirstNumber());
        System.out.println("Second Number: " + calculator.getSecondNumber());
        System.out.println("Addition Result: " + calculator.getAdditionResult());
        System.out.println("Subtraction Result: " + calculator.getSubtractionResult());
        System.out.println("Multiplication Result: " + calculator.getMultiplicationResult());
        System.out.println("Division Result: " + calculator.getDivisionResult());
    }
}
