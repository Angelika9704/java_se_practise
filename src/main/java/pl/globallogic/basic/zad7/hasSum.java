package pl.globallogic.basic.zad7;

public class hasSum {
    public static boolean hasEqualSum(int num1, int num2, int sum){
        return (num1 + num2) == sum;
    }

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 6;
        int sum = 9;
        boolean result = hasEqualSum(num1, num2, sum);
        System.out.println("Do " + num1 + " i " + num2 + " dodając, uzyskamy " + sum + "? " + result);
    }
}
