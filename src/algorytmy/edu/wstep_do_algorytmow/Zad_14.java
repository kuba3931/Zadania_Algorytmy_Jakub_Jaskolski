package algorytmy.edu.wstep_do_algorytmow;

import java.util.ArrayList;

public class Zad_14 {

    public static void main(String[] args) {

        boolean[] propaganda = {true,true,false,false,true};
        boolean[] news = {false,true,false,true,false};

        fact_check(propaganda);
        fact_check(news);

    }

    public static void fact_check(boolean[] x){

        ArrayList<Object> truth = new ArrayList<>();

        int i;

        for (i = 0 ; i < x.length ; i++ ){

            if (x[i]){
                truth.add(x[i]);
            }
        }

        System.out.println(truth);

    }
}
