class Demo054 {
    public void display(int a) {
        System.out.println("Arguments: " + a);
    }
    public void display(int a, int b) {
        System.out.println("Arguments: " + a + ", " + b);
    }
    public void display(String a) {
        System.out.println("Arguments: " + a);
    }

    public static void main(String[] args) {
        Demo054 obj = new Demo054();
        obj.display(10);
        obj.display(10, 20);

        // Calls method with a String parameter
        obj.display("Hello");
    }
}
