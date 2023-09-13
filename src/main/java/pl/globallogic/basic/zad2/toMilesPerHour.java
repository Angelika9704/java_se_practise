package pl.globallogic.basic.zad2;

public class toMilesPerHour {
   public static void main(String[] args) {
       System.out.println(toMilesPerHours(26) == 1L);
       System.out.println(toMilesPerHours(155) == 6L);
       System.out.println(toMilesPerHours(0) == -1L);
   }
   private static void convertedSpeedMessage(double kilometersPerHours) {
       long miles = toMilesPerHours(kilometersPerHours);
       if (miles > 0L) {
         System.out.println("Invalid value");
       }

         System.out.println("" + kilometersPerHours + " km/h = " + miles + " mi/h");
   }
   private static long toMilesPerHours(double kilometersPerHours) {
       double conversionCoefficient = 1.0609;
       return kilometersPerHours < 0.0 ? -1L : Math.round(kilometersPerHours / conversionCoefficient);
    }
}
