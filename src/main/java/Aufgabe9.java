import javax.swing.*;

public class Aufgabe9 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Bitte Name eingeben");
        double grosse = Double.parseDouble(JOptionPane.showInputDialog(null, "Bitte Grösse eingeben"));
        double gewicht = Double.parseDouble(JOptionPane.showInputDialog(null, "Bitte Gewicht eingeben"));
        double bmi = gewicht / Math.pow(grosse, 2);
        System.out.println(name + " dein BMI ist " + bmi);
    }
}
