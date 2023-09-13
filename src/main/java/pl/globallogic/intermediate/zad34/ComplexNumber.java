package pl.globallogic.intermediate.zad34;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber complexNumber) {
        this.real += complexNumber.getReal();
        this.imaginary += complexNumber.getImaginary();
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber complexNumber) {
        this.real -= complexNumber.getReal();
        this.imaginary -= complexNumber.getImaginary();
    }

    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(5, 3);
        ComplexNumber num2 = new ComplexNumber(4, 2);

        num1.add(4, 2);
        System.out.println("num1 after add: " + num1.getReal() + " + " + num1.getImaginary() + "i");

        num1.subtract(num2);
        System.out.println("num1 after subtract: " + num1.getReal() + " + " + num1.getImaginary() + "i");
    }
}

