package pl.globallogic.basic.zad1;

public class checkNumber {
    public static void checkerNumber(int number){
            if (number > 0) {
    System.out.println("positive");
            } else if (number < 0){
    System.out.println("negative");
            } else {
    System.out.println("zero");
            }
        }
    public static void main(String[] args) {
        int exampleNumber = 26;
        checkerNumber(exampleNumber);
    }
}

