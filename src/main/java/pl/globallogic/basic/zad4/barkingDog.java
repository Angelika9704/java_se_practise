package pl.globallogic.basic.zad4;

public class barkingDog {
    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        if (barking){
            if (hourOfDay < 0 || hourOfDay > 23){
                return false;
        } else if (hourOfDay < 8 || hourOfDay > 22){
                return true;
        }
    }
      return false;
}
 public static void main(String[] args) {
    boolean isBarking = true;
    int hour = 7;
    boolean shouldWake = shouldWakeUp(isBarking, hour);
     System.out.println("Should I wake up? " + shouldWake);
    }
}
