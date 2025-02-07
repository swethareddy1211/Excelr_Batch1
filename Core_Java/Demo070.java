public class Demo070 {
    public static void main(String[] args) {
        // Define and initialize an array
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Loop through the array and check for prime numbers
        System.out.println("Prime numbers in the array are:");
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                System.out.print(array[i] + " ");
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
