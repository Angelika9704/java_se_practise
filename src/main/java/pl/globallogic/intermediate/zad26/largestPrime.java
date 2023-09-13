package pl.globallogic.intermediate.zad26;

public class largestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1; // Invalid value check
        }

        int largestPrime = -1;

        while (number % 2 == 0) {
            largestPrime = 2;
            number /= 2;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                largestPrime = i;
                number /= i;
            }
        }

        if (number > 2) {
            largestPrime = number;
        }

        return largestPrime;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));  // Output: 7 (3 * 7)
        System.out.println(getLargestPrime(45));  // Output: 5 (3 * 5)
        System.out.println(getLargestPrime(17));  // Output: 17 (prime number)
        System.out.println(getLargestPrime(1));   // Output: -1 (invalid value)
        System.out.println(getLargestPrime(-10)); // Output: -1 (invalid value)
    }
}
