package algorytmy.edu.algorytmy;

public class Zad_11 {

    public static void main(String[] args) {

        to_binary(5);
        to_binary(18);
        to_binary(32);

    }

    public static void to_binary(int a){

        String binary = Integer.toBinaryString(a);
        System.out.println(binary);

    }
}
