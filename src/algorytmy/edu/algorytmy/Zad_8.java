package algorytmy.edu.algorytmy;

public class Zad_8 {

    public static void main(String[] args) {

        String wyraz = "Mam ochote na tosty";


        int i;
        char znak;
        int n = 0;

        for (i = 0; i < wyraz.length(); i++) {
            znak = wyraz.charAt(i);

            if (Character.isAlphabetic(znak)) {
                n += 1;
            }
            if (i + 1 == wyraz.length()) {
                System.out.println("W wyrazie znajduje sie " + n + " liter");
            }
        }
    }
}
