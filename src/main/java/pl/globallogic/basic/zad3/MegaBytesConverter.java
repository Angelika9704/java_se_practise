package pl.globallogic.basic.zad3;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0){
            System.out.println("Niepoprawna wartość");
        }else{
            int megaBytes = kiloBytes / 1000;
            int remainingKiloBytes = kiloBytes % 1000;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB i " + remainingKiloBytes + " KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2000);
        printMegaBytesAndKiloBytes(-1000);
        printMegaBytesAndKiloBytes(8000);
    }
}
