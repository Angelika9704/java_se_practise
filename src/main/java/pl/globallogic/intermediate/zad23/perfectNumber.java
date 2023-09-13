package pl.globallogic.intermediate.zad23;

public class perfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false; // Invalid value check
        }

        int sumOfDivisors = 0;

        for (int divisor = 1; divisor < number; divisor++) {
            if (number % divisor == 0) {
                sumOfDivisors += divisor;
            }
        }

        return sumOfDivisors == number;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));  // Output: true (6 is a perfect number)
        System.out.println(isPerfectNumber(28)); // Output: true (28 is a perfect number)
        System.out.println(isPerfectNumber(12)); // Output: false (12 is not a perfect number)
        System.out.println(isPerfectNumber(-6)); // Output: false (invalid value)
    }
}
