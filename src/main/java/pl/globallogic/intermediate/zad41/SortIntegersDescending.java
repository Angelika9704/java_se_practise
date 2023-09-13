package pl.globallogic.intermediate.zad41;

import java.util.Scanner;
import java.util.Arrays;

public class SortIntegersDescending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int size = scanner.nextInt();
        int[] myArray = getIntegers(size);

        System.out.println("Original array:");
        printArray(myArray);

        int[] sortedArray = sortIntegers(myArray);

        System.out.println("Sorted array in descending order:");
        printArray(sortedArray);
    }

    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element #" + i + ": ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        for (int i = 0; i < sortedArray.length / 2; i++) {
            int temp = sortedArray[i];
            sortedArray[i] = sortedArray[sortedArray.length - 1 - i];
            sortedArray[sortedArray.length - 1 - i] = temp;
        }
        return sortedArray;
    }
}

