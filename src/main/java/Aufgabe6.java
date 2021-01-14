import javax.swing.*;
public class Aufgabe6 {
    public static void main(String[] args) {
        boolean test = true;
        while (test) {
            String name = JOptionPane.showInputDialog(null, "Bitte Namen eingeben");
            if (name.equals("Moritz")) {
                System.out.println("Das bin ich!");
                test = false;
            }
            else  {
                System.out.println("Das bin ich nicht!");
            }
        }
    }
}