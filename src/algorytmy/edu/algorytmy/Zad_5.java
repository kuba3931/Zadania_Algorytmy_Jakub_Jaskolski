package algorytmy.edu.algorytmy;

public class Zad_5 {

    public static void main(String[] args) {

        int i = 0;
        int n = 100;

        while (i != n){

            i++;

            if (i % 3 == 0 && i % 5 ==0){
                System.out.println("FizzBuzz");
            }

            else if (i % 3 == 0){
                System.out.println("Fizz");
            }

            else if (i % 5 == 0){
                System.out.println("Buzz");
            }

            else{
                System.out.println(i);
            }

        }

    }
}
