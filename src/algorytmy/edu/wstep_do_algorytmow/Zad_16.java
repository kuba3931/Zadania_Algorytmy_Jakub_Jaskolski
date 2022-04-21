package algorytmy.edu.wstep_do_algorytmow;

public class Zad_16 {

    public static void main(String[] args) {

        System.out.println(pitagoras(3,4,5));
        System.out.println(pitagoras(5,12,13));
        System.out.println(pitagoras(1,2,3));



    }

    public static boolean pitagoras(int a, int b, int c){

        return a * a + b * b == c * c;

    }
}
