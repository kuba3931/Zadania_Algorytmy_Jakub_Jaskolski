package algorytmy.edu.wstep_do_algorytmow;

public class Zad_27 {

    public static void main(String[] args) {

        pesel("81020334565");
        pesel("345234453");
        pesel("81P20334565");
        pesel("12323423136");

    }

    public static void pesel(String a){

        int i;
        int n = 0;
        char znak;

        if (a.length() != 11){

            System.out.println(a + " nie jest peselem");

        }

        else {

            for (i = 0; i < 11; i++) {

                znak = a.charAt(i);

                if (!Character.isDigit(znak)) {
                    break;
                }

                if (i == 10) {
                    n = 1;
                }
            }

            if (n == 1) {
                System.out.println(a + " jest peselem");
            }

            else {
                System.out.println(a + " nie jest peselem");
            }
        }
    }
}
