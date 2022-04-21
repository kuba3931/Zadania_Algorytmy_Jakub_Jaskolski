package algorytmy.edu.wstep_do_algorytmow;

import java.util.ArrayList;

public class Zad_10 {

    public static void main(String[] args) {

        String[] mix = {"Hello", "World","Thanks","Breakfast", "World", "Tanks" ,"Bye","Thanks"};

        fiver(mix);

    }

    public static void fiver (String[] x){

        ArrayList<Object> fives = new ArrayList<>();

        int i;

        for (i = 0 ; i < x.length ; i++){

            if (!fives.contains(x[i]) && x[i].length() == 5){
                fives.add(x[i]);
            }
        }

        System.out.println(fives);

    }
}
