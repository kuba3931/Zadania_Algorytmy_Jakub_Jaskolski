package algorytmy.edu.algorytmy;

public class Zad_9 {

    public static void main(String[] args) {

        fibbonaci(3);
        fibbonaci(8);
        fibbonaci(12);

    }

    public static void fibbonaci (int a){

        int i = 0;
        int old = 1;
        int last = 1;
        int suma = 0;

        while(i + 2 != a){

            suma = last + old;
            old = last;
            last = suma;

            i++;
        }

        System.out.println(a + " wyraz ciagu to " + suma);

    }
}
