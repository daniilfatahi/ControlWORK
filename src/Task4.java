import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        int fib0 = 1;
        int fib1 = 1;
        int fib2;

        System.out.print(fib0+ " " + fib1 + " ");
        for (int i = 3; i <= 50; i++){
            fib2 = fib0 + fib1;
            System.out.print(fib2 + " ");
            fib0 = fib1;
            fib1 = fib2;
        }
        System.out.println();







    }
}
