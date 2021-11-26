import sun.jvm.hotspot.utilities.ReversePtrs;

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {

System.out.println("Enter the string you want to reverse: ");
Scanner inScanner = new Scanner(System.in);

String instring = inScanner.nextLine();
      String reversed =  new StringBuilder(instring).reverse().toString();

        System.out.println( reversed + " is your reversed string");




    }
}
