package algorytmy.edu.wstep_do_algorytmow;

import java.util.*;

public class Zad_6 {

    public static void main(String[] args) {

        int[] liczby = new int[] {2, 3};
        int[] cyferki = new int[] {5, 8, 3};

        swap(liczby);
        swap(cyferki);

    }

    public static void swap(int[] x){

        ArrayList swapped =  new ArrayList();
        int i;

        for (i = 1; i <= x.length; i++){

            swapped.add(x[x.length - i]);
        }

        System.out.println("twoja zmieniona lista to \n" + swapped + "\n");

        }


}
