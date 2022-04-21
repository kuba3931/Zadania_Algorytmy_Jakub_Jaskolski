package algorytmy.edu.algorytmy;

public class Zad_2 {

    public static void main(String[] args) {

        int is_prime = 781;
        int i = 2;

        while (i != is_prime) {

            if (i + 1 == is_prime) {
                System.out.println("Liczba " + is_prime + " jest pierwsza");
                break;
            }

            if (is_prime % i == 0) {
                System.out.println("Liczba " + is_prime + " jest zlozona");
                break;
            }

            i++;

        }


    }
}
