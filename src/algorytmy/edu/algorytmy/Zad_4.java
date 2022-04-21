package algorytmy.edu.algorytmy;

import java.util.ArrayList;

public class Zad_4 {

    public static void main(String[] args) {

        String[] duplexes = {"Hello", "World","Thanks","GG HF", "World","GG EZ","Bye","Thanks"};

        unikat(duplexes);

    }

    public static void unikat (String[] x){

        ArrayList<Object> uniplexes = new ArrayList<>();

        int i;

        for (i = 0 ; i < x.length ; i++){

            if (!uniplexes.contains(x[i])){
                uniplexes.add(x[i]);
            }
        }

        System.out.println(uniplexes);

    }

}
