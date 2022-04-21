package algorytmy.edu.wstep_do_algorytmow;

import java.util.ArrayList;
import java.util.Arrays;

public class Zad_8 {

    public static void main(String[] args) {

        int[] liczby = new int[] {6, 3, 9};
        int[] cyferki = new int[] {5, 8, 3};

        sort(liczby);
        sort(cyferki);
    }

    public static void sort(int[] x){

        Arrays.sort(x);

        System.out.println();
    }
}
