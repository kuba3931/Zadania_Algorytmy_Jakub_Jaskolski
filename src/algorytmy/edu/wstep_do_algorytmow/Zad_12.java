package algorytmy.edu.wstep_do_algorytmow;

public class Zad_12 {

    public static void main(String[] args) {

        String[] mix = {"Hello", "World", "Thanks", "Breakfast", "World", "Tanks", "Bye", "Thanks"};

        System.out.println("najdluzszy wyraz ma " + max_len(mix) + " liter");

    }

    public static int max_len(String[] x) {

        int k = 0;

        for (String s : x) {

            int n = s.length();

            if (n > k) {
                k = n;
            }
        }

        return k;
    }
}
