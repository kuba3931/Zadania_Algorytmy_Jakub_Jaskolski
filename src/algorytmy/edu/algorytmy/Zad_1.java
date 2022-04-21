package algorytmy.edu.algorytmy;

public class Zad_1 {

    public static void main(String[] args) {

        int[] numbers = {1, 13, 51322, -513, 0, 53, 100, 555};

        int max = numbers[0];
        int i;

        for(i = 0 ; i< numbers.length ; i++){

            if (numbers[i] > max){
                max = numbers[i];
            }

        }

        System.out.println("Najwieksza liczba z ciagu to " + max);

    }
}
