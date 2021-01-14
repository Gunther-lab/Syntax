public class Aufgabe4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print("\n" + i + "-er Reihe:");
            for (int j = 1; j <= 10; j++) {
                int zahl = i * j;
                System.out.print(" "+ zahl);
            }
        }
    }
}