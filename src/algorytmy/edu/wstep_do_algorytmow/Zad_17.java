package algorytmy.edu.wstep_do_algorytmow;

public class Zad_17 {

    public static void main(String[] args) {

        even(78);
        even(-4);
        even(3);

    }

    public static void even(int a){

        if (a % 2 == 0){
            System.out.println("Liczba " + a + " jest parzysta");
        }
        else{
            System.out.println("Liczba " + a + " jest nieparzysta");
        }

    }

}
