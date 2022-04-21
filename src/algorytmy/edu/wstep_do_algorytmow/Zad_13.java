package algorytmy.edu.wstep_do_algorytmow;

import java.util.ArrayList;

public class Zad_13 {

    public static void main(String[] args) {

        int[] liczby = new int[] {1,5,6,7,3};
        int[] cyfry = new int[] {11,31,33,87,101};

        find_primes(liczby);
        find_primes(cyfry);

    }

    public static void find_primes(int[] x){

        ArrayList two_divisors = new ArrayList<>();

        int i;
        int j;
        int n = 0;

        for (i = 0 ; i < x.length ; i++){

            for(j = 1 ; j <= x[i] ; j++){

                if (x[i] % j ==0){
                    n += 1;
                }

            }

            if (n == 2){
                two_divisors.add(x[i]);
            }

            n = 0;

        }

        System.out.println("liczby ktore maja 2 dzielniki to " + two_divisors);

    }
}
