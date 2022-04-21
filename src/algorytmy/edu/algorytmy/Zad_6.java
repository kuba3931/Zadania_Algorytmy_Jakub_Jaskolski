package algorytmy.edu.algorytmy;

public class Zad_6 {

    public static void main(String[] args) {

        String wyraz = "kajakajak";

        int i;
        int n = wyraz.length() - 1;

        for (i = 0; i <= n; i++) {

            if (wyraz.charAt(i) != wyraz.charAt(n - i)) {
                System.out.println("Wyraz nie jest palidromem");
                break;
            }

            if (i == n){
                System.out.println("wyraz jest palidromem");
            }
        }
    }
}
