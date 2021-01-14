import javax.swing.*;

public class Aufgabe10 {
    public static void main(String[] args) {

        int zahl1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte 1. Zahl eingeben"));
        String operator = JOptionPane.showInputDialog(null, "Bitte Operator eingeben");
        int zahl2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte 2. Zahl eingeben"));

        int resultat = 0;
        boolean fale = false;

        switch (operator) {
            case("+"):
                resultat = zahl1 + zahl2;
                System.out.println();
                break;
            case("-"):
                resultat = zahl1 - zahl2;
                System.out.println();
                break;
            case("*"):
                resultat = zahl1 * zahl2;
                System.out.println();
                break;
            case("/"):
                resultat = zahl1 / zahl2;
                System.out.println();
                break;
            default:
                fale = true;
                System.out.println("Bitte geben einen gültigen Operator ein!");
        }
        if (!fale)
            System.out.println(zahl1 + " " + operator + " " + zahl2 + " ergibt " + resultat);
    }
}
