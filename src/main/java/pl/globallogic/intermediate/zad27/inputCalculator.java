package pl.globallogic.intermediate.zad27;

import java.util.Scanner;

public class inputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int count = 0;

        while (true) {
            System.out.println("Enter a number (or any non-integer input to calculate): ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                break;
            }
        }

        if (count > 0) {
            average = Math.round((double) sum / count);
        }

        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
