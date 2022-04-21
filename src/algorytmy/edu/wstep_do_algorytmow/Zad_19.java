package algorytmy.edu.wstep_do_algorytmow;

public class Zad_19 {

    public static void main(String[] args) {

        System.out.println(square(4));
        System.out.println(square(8));
        System.out.println(square(16));


    }

    public static boolean square(int a){

        int n = (int) Math.sqrt(a);

        return n * n == a;

    }
}
