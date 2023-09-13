package pl.globallogic.basic.zad10;

public class yearsAndDays {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / (60 * 24 * 365);
            long remainingMinutes = minutes % (60 * 24 * 365);
            long days = remainingMinutes / (60 * 24);
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
    public static void main(String[] args) {
           // Example usage:
           printYearsAndDays(525600); // Should print "525600 min = 1 y and 0 d"
           printYearsAndDays(1051200); // Should print "1051200 min = 2 y and 0 d"
           printYearsAndDays(-1000); // Should print "Invalid Value"
   }
}
