public class Demo071 {
    public static void main(String[] args) {
        // Define and initialize an array
        int[] array = {1, 2, 3, 4, 5};
        
        // Call the method to reverse the array
        reverseArray(array);
        
        // Print the reversed array
        System.out.println("Reversed array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // Method to reverse the array
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            // Swap the elements
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
