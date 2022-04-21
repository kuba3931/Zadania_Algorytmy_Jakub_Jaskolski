package algorytmy.edu.wstep_do_algorytmow;


public class Zad_15 {

    public static void main(String[] args) {

        int[] liczby = new int[] {2, 3, 3, 3, 4, 4, 5};
        int[] cyferki = new int[] {5, 5, 5, 5, 8, 8, 10};

        counter(3,liczby);
        counter(4,liczby);
        counter(5,cyferki);

    }

    public static void counter(int a , int[] x){

        int i;
        int n = 0;

        for (i = 0; i < x.length; i++){

            if (x[i] == a){
                n += 1;
            }

        }

        System.out.println("Lista zawiera " + n + " razy liczbe " + a);

    }
}
