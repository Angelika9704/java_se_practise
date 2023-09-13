package pl.globallogic.basic.zad8;

public class teenager {
    public static boolean hasTeen(int num1, int num2, int num3){
        return (num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19);
    }

    public static void main(String[] args) {
        int age1 = 11;
        int age2 = 14;
        int age3 = 21;
        boolean result = hasTeen(age1, age2, age3);
        System.out.println("At least one of the age is a teen: " + result);
    }
}
