package algorytmy.edu.wstep_do_algorytmow;

import java.util.ArrayList;

public class Zad_9 {

    public static void main(String[] args) {

        int[] liczby = new int[] {6, 4, 11, 9};
        int[] cyferki = new int[] {5, 8, 7, 3, 1, 2};
        int[] cyfry = new int[] {5, 7, 3};

        middle(liczby);
        middle(cyferki);
        middle(cyfry);


    }

    public static void middle(int[] x) {

        ArrayList<Integer> middled = new ArrayList<>();

        int i;

        if (x.length % 2 != 0){
            System.out.println("Wymagana tablica z parzysta ilościa elementOw");
        }

        else {

            for (i = 0; i < x.length; i++) {

                if (x.length / 2 == i || x.length / 2 == i + 1) {
                    middled.add(x[i]);
                }
            }

            System.out.println(middled);
        }
    }
}