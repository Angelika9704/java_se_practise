package pl.globallogic.intermediate.zad16;

public class numberPalindrome {
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false; // Negative numbers cannot be palindromes
        }

        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));    // Output: true
        System.out.println(isPalindrome(12321));  // Output: true
        System.out.println(isPalindrome(12345));  // Output: false
        System.out.println(isPalindrome(-121));   // Output: false
    }
}
