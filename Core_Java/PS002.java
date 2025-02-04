import java.util.Scanner;

public class PS002 {

    public static void main(String[] args) {
        Scanner var1 = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int var2 = var1.nextInt();

        if (var2 <= 0) {
            System.out.println(-1);
        } else {
            int nextMultiple = ((var2 / 100) + 1) * 100;
            System.out.println("Next multiple of 100: " + nextMultiple);
        }

        var1.close();
    }
}