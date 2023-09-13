package pl.globallogic.intermediate.zad42;

import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        int count = readInteger();
        int[] elements = readElements(count);
        int min = findMin(elements);

        System.out.println("Minimum element: " + min);
    }

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        return scanner.nextInt();
    }

    public static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter element #" + (i + 1) + ": ");
            elements[i] = scanner.nextInt();
        }

        return elements;
    }

    public static int findMin(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}

