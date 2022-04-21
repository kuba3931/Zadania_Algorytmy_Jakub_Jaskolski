package algorytmy.edu.wstep_do_algorytmow;

public class Zad_24 {

    public static void main(String[] args) {

        prime(4);
        prime(781);

        }


    public static void prime(int a){

        int i = 2;

        while (i != a) {

            if (i + 1 == a) {
                System.out.println("Liczba " + a + " jest pierwsza");
                break;
            }

            if (a % i == 0) {
                System.out.println("Liczba " + a + " jest zlozona");
                break;
            }

            i++;

            }

    }
}