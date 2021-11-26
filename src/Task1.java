import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = inScanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even");
        }
        else if (number % 2 != 0 ){
            System.out.println("The number " + number + " is odd");
        }
        else {
            System.out.println("Enter int =, please");
        }


    }


}
