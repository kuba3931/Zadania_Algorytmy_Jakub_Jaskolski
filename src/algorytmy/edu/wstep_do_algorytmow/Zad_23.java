package algorytmy.edu.wstep_do_algorytmow;

public class Zad_23 {

    public static void main(String[] args) {

        cubed(27);
        cubed(87);
        cubed(-125);



    }

    public static void cubed(int a){

        int n = (int) Math.cbrt(a);

        if ( n*n*n == a && n >= 0){
            System.out.println("Liczba " + a + " jest szescianem liczby " + n);
        }
        else{
            System.out.println("Liczba " + a + " nie jest szescianem zadnej liczby naturalnej");
        }
    }
}
