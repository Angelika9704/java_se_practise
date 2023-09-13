package pl.globallogic.intermediate.zad43;

public class ReverseArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Original Array = " + java.util.Arrays.toString(originalArray));

        reverse(originalArray);

        System.out.println("Reversed Array = " + java.util.Arrays.toString(originalArray));
    }

    public static void reverse(int[] array) {
        int length = array.length;
        int temp;

        for (int i = 0; i < length / 2; i++) {
            temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }
    }
}
