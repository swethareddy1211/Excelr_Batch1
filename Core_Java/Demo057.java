import java.util.Scanner;

public class Demo057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int lastDigit = number % 10;
        int firstDigit = number;

        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        int sum = firstDigit + lastDigit;
        System.out.println("The sum of the first and last digits is: " + sum);
    }
}
