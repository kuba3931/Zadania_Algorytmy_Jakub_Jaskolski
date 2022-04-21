package algorytmy.edu.wstep_do_algorytmow;

import java.util.ArrayList;

public class Zad_22 {

    public static void main(String[] args) {

        dividers(7);
        dividers(48);

    }

    public static void dividers(int a){

        ArrayList<Integer> dzielniki = new ArrayList<>();

        int i;

        for (i = 1 ; i <= a ; i++){

            if(a % i == 0){
                dzielniki.add(i);
            }
        }

        int o = dzielniki.size();

        System.out.println("liczba " + a +" ma " + o + " dzielniki");
    }
}
