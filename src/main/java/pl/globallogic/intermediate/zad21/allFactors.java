package pl.globallogic.intermediate.zad21;

public class allFactors {
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        printFactors(6);  // Output: 1 2 3 6
        printFactors(12); // Output: 1 2 3 4 6 12
        printFactors(9);  // Output: 1 3 9
        printFactors(-5); // Output: Invalid Value
    }
}
