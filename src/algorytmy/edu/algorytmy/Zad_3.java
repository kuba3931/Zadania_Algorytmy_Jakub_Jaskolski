package algorytmy.edu.algorytmy;

public class Zad_3 {

    public static void main(String[] args) {

        int[] numbers = {1, 1, 4, -45, 6, 6, 190, 151, -6, -52};

        int min = numbers[0];
        int max = numbers[0];
        int i;

        for (i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }

        }

        System.out.println("Najwieksza liczba to " + max);
        System.out.println("Najmniejsza liczba to " + min);

    }
}
