public class Demo069 {
    public static void main(String[] args) {
        // Define and initialize an array
        int[] array = {1, 2, 3, 4, 5};
        
        // Variable to store the sum of elements
        int sum = 0;
        
        // Loop through the array and add each element to the sum
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        // Print the sum of the elements
        System.out.println("The sum of all elements in the array is: " + sum);
    }
}
