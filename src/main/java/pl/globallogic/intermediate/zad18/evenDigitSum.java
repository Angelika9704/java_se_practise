package pl.globallogic.intermediate.zad18;

public class evenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1; // Invalid value for a negative number
        }

        int evenDigitSum = 0;

        while (number > 0) {
            int digit = number % 10; // Get the last digit
            if (digit % 2 == 0) {
                evenDigitSum += digit; // Add even digit to the sum
            }
            number /= 10; // Remove the last digit
        }

        return evenDigitSum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(12345));  // Output: 6 (2 + 4)
        System.out.println(getEvenDigitSum(2468));   // Output: 20 (2 + 4 + 6 + 8)
        System.out.println(getEvenDigitSum(13579));  // Output: 0 (no even digits)
        System.out.println(getEvenDigitSum(-123));   // Output: -1 (invalid input)
    }
}
