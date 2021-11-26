import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
int temp;
int digit = 0;
        Scanner inScanner = new Scanner(System.in);
        System.out.println("Enter the number you want to check on Armstrong number :)");
        int num = inScanner.nextInt();
        int sum = 0;
temp = num;
while (temp > 0){
    digit = temp % 10;
    sum += Math.pow(digit,3);
    temp /= 10;
}
if (num == sum){
    System.out.println(num + " is an Armstrong number");
}
else {
    System.out.println(num + " is not an Armstrong number");
}


    }
}
