package pl.globallogic.intermediate.zad14;

public class numberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1997));
        System.out.println(isLeapYear(2024));
        System.out.println(isLeapYear(2222));
        System.out.println(isLeapYear(3333));
    }
}
