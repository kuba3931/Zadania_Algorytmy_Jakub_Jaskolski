package algorytmy.edu.wstep_do_algorytmow;

import java.util.ArrayList;
import java.util.Locale;

public class Zad_11 {

    public static void main(String[] args) {

        String[] mix = {"Hello", "World", "Thanks", "BreakFast", "world", "Tanks", "BYE", "THX"};

        low_rider(mix);


    }

    public static void low_rider(String[] x) {

        ArrayList<Object> lowered = new ArrayList<>();

        int i;

        for (i = 0; i < x.length; i++) {

            String a = x[i].toLowerCase(Locale.ROOT);
            lowered.add(a);

        }

        System.out.println(lowered);

    }
}
