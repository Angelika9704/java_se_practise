package pl.globallogic.intermediate.zad20;

public class lastDigitChecker {
    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if (!isValid(number1) || !isValid(number2) || !isValid(number3)) {
            return false; // Check if all numbers are within the valid range
        }

        int lastDigit1 = number1 % 10;
        int lastDigit2 = number2 % 10;
        int lastDigit3 = number3 % 10;

        return (lastDigit1 == lastDigit2) || (lastDigit1 == lastDigit3) || (lastDigit2 == lastDigit3);
    }

    // Helper method to check if a number is within the valid range [10, 1000]
    private static boolean isValid(int number) {
        return (number >= 10 && number <= 1000);
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));    // Output: true (last digit 1 is shared)
        System.out.println(hasSameLastDigit(23, 32, 42));    // Output: true (last digit 2 is shared)
        System.out.println(hasSameLastDigit(9, 99, 999));    // Output: false (number1 is out of range)
        System.out.println(hasSameLastDigit(123, 456, 789)); // Output: false (no shared last digits)
    }
}
