package pl.globallogic.intermediate.zad15;

public class sumOdd {
    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if (start > end || start <= 0 || end <= 0) {
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isOdd(5));          // Output: true
        System.out.println(isOdd(10));         // Output: false
        System.out.println(sumOdd(1, 10));     // Output: 25 (1 + 3 + 5 + 7 + 9)
        System.out.println(sumOdd(1, 5));      // Output: 9 (1 + 3 + 5)
        System.out.println(sumOdd(6, 3));      // Output: -1 (Invalid input)
    }
}
