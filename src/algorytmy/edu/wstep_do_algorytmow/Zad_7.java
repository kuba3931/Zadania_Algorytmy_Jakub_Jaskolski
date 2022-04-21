package algorytmy.edu.wstep_do_algorytmow;

public class Zad_7 {

    public static void main(String[] args) {

        try {
        /* Zadanie 7.
        Co z tym kodem jest nie tak? */
            int[] array = new int[5];
            for (int i = 0; i <= 5; i++) {
                array[i] = 12;
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Niepoprawny rozmiar tablicy, indeksy tablicy sa o jeden mniejsze\nod jej rozmiaru bo pierwszy indeks to zero");
        }

    }
}
