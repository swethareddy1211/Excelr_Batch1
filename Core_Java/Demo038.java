import java.util.Scanner;

public class Demo038 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            char ch = scanner.next().charAt(0);
            
            if (Character.isUpperCase(ch)) {
                System.out.println(ch + " is an uppercase character.");
            } else if (Character.isLowerCase(ch)) {
                System.out.println(ch + " is a lowercase character.");
            } else {
                System.out.println(ch + " is neither an uppercase nor a lowercase character.");
            }
        }
    }
}