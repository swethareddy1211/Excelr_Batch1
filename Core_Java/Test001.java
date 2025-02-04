public class Test001 {
    public static void main(String[] args) {
        int x;
        for(x = 0; x < 10; x++){
            if (x == 5 || x == 7) {
                continue;
            }

            System.out.println(x);
        }
        
    }
    
}
