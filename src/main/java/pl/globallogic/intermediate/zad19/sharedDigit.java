package pl.globallogic.intermediate.zad19;

public class sharedDigit {
    public static boolean hasSharedDigit(int number1, int number2) {
        if (!isValid(number1) || !isValid(number2)) {
            return false; // Check if both numbers are within the valid range
        }

        int digit1Number1 = number1 % 10;
        int digit2Number1 = number1 / 10;
        int digit1Number2 = number2 % 10;
        int digit2Number2 = number2 / 10;

        return digit1Number1 == digit1Number2 || digit1Number1 == digit2Number2 ||
                digit2Number1 == digit1Number2 || digit2Number1 == digit2Number2;
    }

    // Helper method to check if a number is within the valid range [10, 99]
    private static boolean isValid(int number) {
        return (number >= 10 && number <= 99);
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));   // Output: true (shared digit 2)
        System.out.println(hasSharedDigit(9, 99));    // Output: false (number1 is out of range)
        System.out.println(hasSharedDigit(15, 55));   // Output: true (shared digit 5)
        System.out.println(hasSharedDigit(12, 34));   // Output: false (no shared digits)
    }
}
