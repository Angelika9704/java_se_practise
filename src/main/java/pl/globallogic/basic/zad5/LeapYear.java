package pl.globallogic.basic.zad5;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999){
            return false;
        }else {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                return  true;
            }else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        int yearToCheck = 2024;
        boolean isLeap = isLeapYear(yearToCheck);
        System.out.println(yearToCheck + " is a leap year: " + isLeap);
    }
}
