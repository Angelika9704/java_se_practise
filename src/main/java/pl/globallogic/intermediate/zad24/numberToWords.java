package pl.globallogic.intermediate.zad24;

public class numberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            int reversedNumber = reverse(number);
            int originalDigitCount = getDigitCount(number);
            int reversedDigitCount = getDigitCount(reversedNumber);

            while (reversedNumber > 0) {
                int digit = reversedNumber % 10;
                switch (digit) {
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                }
                reversedNumber /= 10;
            }

            // Add leading zeroes if necessary
            if (originalDigitCount > reversedDigitCount) {
                int leadingZeroes = originalDigitCount - reversedDigitCount;
                for (int i = 0; i < leadingZeroes; i++) {
                    System.out.print("Zero ");
                }
            }

            System.out.println();
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        numberToWords(123);       // Output: "One Two Three"
        numberToWords(1010);      // Output: "One Zero One Zero"
        numberToWords(100);       // Output: "One Zero Zero"
        numberToWords(0);         // Output: "Zero"
        numberToWords(-12);       // Output: "Invalid Value"
    }
}
