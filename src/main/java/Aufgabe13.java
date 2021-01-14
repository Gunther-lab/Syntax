public class Aufgabe13 {
    public static void main(String[] args) {
        long[] numbersAsLong = {10, 20, 30};

        int[] numberAsInteger = new int[numbersAsLong.length];

        //numberAsInteger = numbersAsLong;

        for (int number : numberAsInteger){
            System.out.println(number);
        }
    }
}
