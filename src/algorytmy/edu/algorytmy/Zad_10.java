package algorytmy.edu.algorytmy;

public class Zad_10 {

    public static void main(String[] args) {

        int n = 7;
        int suma = 1;
        int i = 0;

        while (i != n) {

            i++;

            suma += i;

            if (i == n) {
                System.out.println("Suma twoich liczb to " + (suma - 1));
            }
        }
    }
}
