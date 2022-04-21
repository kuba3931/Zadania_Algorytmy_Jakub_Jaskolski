package algorytmy.edu.wstep_do_algorytmow;

public class Zad_21 {

    public static void main(String[] args) {

        System.out.println(compare("bieda","hajs"));
        System.out.println(compare("smutek","zadowolenia"));

    }

    public static int compare(String a, String b) {

        int n = a.length();
        int m = b.length();

        return Math.max(n,m);

    }
}
