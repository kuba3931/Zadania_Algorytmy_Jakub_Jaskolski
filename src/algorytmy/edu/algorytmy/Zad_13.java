package algorytmy.edu.algorytmy;

import java.util.ArrayList;

public class Zad_13 {

    public static void main(String[] args) {

        int[] liczby = new int[] {6, 3, 9, 23, -1, -6, -9, 5, -5,};
        int[] cyferki = new int[] {5, 8, -45, 3, -13,-5, 13, 6, -3, 45};

        pairs(liczby);
        pairs(cyferki);

    }

    public static void pairs(int[] x){

        ArrayList<Object> pary = new ArrayList<>();

        int i;
        int k;

        for (i = 0 ; i< x.length ; i++){

            if (!pary.contains(x[i])){

                for (k = 0 ; k < x.length ; k++){

                    if (x[i] + x[k] == 0){

                        pary.add(x[i]);
                        pary.add(x[k]);

                    }
                }
            }
        }

        System.out.println(pary);

    }
}
