package pl.globallogic.intermediate.zad17;

public class firstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1; // Invalid value for a negative number
        }

        // Extract the last digit (remainder when divided by 10)
        int lastDigit = number % 10;

        // Use a loop to find the first digit
        while (number >= 10) {
            number /= 10;
        }

        // 'number' now contains the first digit
        int firstDigit = number;

        // Calculate and return the sum of the first and last digits
        return firstDigit + lastDigit;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(12345));  // Output: 6 (1 + 5)
        System.out.println(sumFirstAndLastDigit(257));    // Output: 9 (2 + 7)
        System.out.println(sumFirstAndLastDigit(5));      // Output: 10 (5 + 5, single-digit number)
        System.out.println(sumFirstAndLastDigit(-123));   // Output: -1 (invalid input)
    }
}
