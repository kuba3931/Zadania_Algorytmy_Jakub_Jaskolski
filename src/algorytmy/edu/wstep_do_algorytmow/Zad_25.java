package algorytmy.edu.wstep_do_algorytmow;

import java.util.ArrayList;

public class Zad_25 {

    public static void main(String[] args) {

        how_many(1,14);
        how_many(10,100);
        how_many(2,10000);


    }

    public static void how_many(int start, int end){

        ArrayList<Integer> dzielniki = new ArrayList<>();

        int i;
        int j;
        int n = 1;
        int k = 1;

        for (j = start - 1; j <= end ; j++){

            for (i = 1 ; i <= j ; i++){

                if(j % i == 0){
                    dzielniki.add(i);
                }
            }

            int o = dzielniki.size();

            dzielniki.clear();

            if (o > n){
                 n = o;
                 k = j;
            }

        }
        System.out.println("najwieksza liczbe dzielnikow ma " + k + " ma ona " + n + " dzielnikow");
    }
}
