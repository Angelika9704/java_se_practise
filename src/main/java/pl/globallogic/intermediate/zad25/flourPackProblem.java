package pl.globallogic.intermediate.zad25;

public class flourPackProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false; // Negative parameter check
        }

        int bigKilos = bigCount * 5; // Kilos in big bags
        int totalKilos = bigKilos + smallCount;

        if (totalKilos < goal) {
            return false; // Not enough flour to reach the goal
        }

        if (goal % 5 > smallCount) {
            return false; // Not enough small bags to make up the remaining kilos
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4)); // Output: false (not enough kilos)
        System.out.println(canPack(1, 0, 5)); // Output: true (exact number of kilos)
        System.out.println(canPack(0, 5, 4)); // Output: true (only small bags)
        System.out.println(canPack(2, 2, 11)); // Output: true (2 big bags + 1 small bag)
        System.out.println(canPack(-1, 0, 5)); // Output: false (negative parameter)
    }
}
