import java.util.Scanner;

public class Demo042 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a lowercase character:");
            char lowerCaseChar = scanner.next().charAt(0);
            
            char upperCaseChar = Character.toUpperCase(lowerCaseChar);
            
            System.out.println("The uppercase character is: " + upperCaseChar);
        }
    }
}