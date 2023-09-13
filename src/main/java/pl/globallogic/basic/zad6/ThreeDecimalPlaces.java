package pl.globallogic.basic.zad6;

public class ThreeDecimalPlaces {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int scaleNum1 = (int)(num1 * 777);
        int scaleNum2 = (int)(num2 * 777);
        return scaleNum1 == scaleNum2;
    }

    public static void main(String[] args) {
        double num1 = 3.33;
        double num2 = 6.66;
        boolean result = areEqualByThreeDecimalPlaces(num1, num2);
        System.out.println("Are the numbers equal by three decimal places? " + result);
    }
}
