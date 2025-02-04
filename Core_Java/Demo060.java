public class Demo060 {
    public static void main(String[] args) {
        int n = 20;
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("The first 20 numbers in the Fibonacci sequence are:");
        for (int num : fibonacci) {
            System.out.print(num + " ");
        }
    }
    
}
