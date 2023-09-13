package pl.globallogic.intermediate.zad22;

public class greatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1; // Invalid value check
        }

        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }

        return first; // 'first' now contains the GCD
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30)); // Output: 6
        System.out.println(getGreatestCommonDivisor(18, 24)); // Output: 6
        System.out.println(getGreatestCommonDivisor(8, 15));  // Output: -1 (invalid value)
        System.out.println(getGreatestCommonDivisor(100, 50)); // Output: 50
    }
}
