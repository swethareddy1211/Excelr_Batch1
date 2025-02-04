public class Demo011 {
    public class SwapNumbers {
        public static void main(String[] args) {
            // Declare and initialize two variables
            int num1 = 10;
            int num2 = 20;
    
            System.out.println("Before Swap:");
            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);
    
            
            int temp = num1;
            num1 = num2;
            num2 = temp;
    
            System.out.println("After Swap:");
            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);
        }
    }
    
    
}
