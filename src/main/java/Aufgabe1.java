public class Aufgabe1 {
    public static void main(String[] args) {
        int a = -5;
        double b = 10.0;
        //Dies ist ein Kommentar
        double resultat = a + b;
        String text = "Das Resultat ist: Die Zahl" + resultat;

        if (resultat < 10.0) {
            System.out.println("Gratulation!");
        } else {
            System.out.println(text);
        }
    }
}