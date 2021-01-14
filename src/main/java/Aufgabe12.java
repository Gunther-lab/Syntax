public class Aufgabe12 {
    public static void main(String[] args) {
        int[] array1 = {
                0, 1, 2, 3, 4,
        };
        for (int array : array1) {
            System.out.println(array);
        }
        int[] array2 = new int[100];
        for (int i = 0; i <= 99; i++) {
            array2[i] = i;
        }

        for (int array : array2) {
            System.out.println(array);
        }

        int resultat = 0;
        for (int array : array2) {
            resultat = resultat + array;
        }
        System.out.println(resultat);

        int resultat2 = 0;
        for (int array : array2) {
            if (array%2 == 0)
                System.out.println(array+1);
            else
                System.out.println(array - 1);
        }
    }
}