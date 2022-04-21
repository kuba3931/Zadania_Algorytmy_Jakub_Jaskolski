package algorytmy.edu.algorytmy;

import static java.lang.Math.abs;

public class Zad_12 {

    public static void main(String[] args) {

        int[] liczby = new int[] {6, 3, 9, 23};
        int[] cyferki = new int[] {5, 8, -45, 3, -13};

        big_roz(liczby);
        big_roz(cyferki);

    }

    public static void big_roz(int[] x){

        int i;
        int k = 0;

        for (i = 0 ; i< x.length - 1 ; i++){

            int n = abs ( x[i+1] - x[i] );

            if (n > k){
                k = n;
            }
        }

        System.out.println("najwieksza roznica miedzy liczbami w to " + k);

    }
}
