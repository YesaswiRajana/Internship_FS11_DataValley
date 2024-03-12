public class Operations {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method to add three doubles
    public  double add(double a, double b, double c) {
        return a + b + c;
    }
    
    // Method to concatenate two strings
    public  String add(String a, String b) {
        return a + b;
        }
    
    // Demonstration of usage
    public static void main(String[] args) {
        Operations op=new Operations();
        int sum1 = op.add(5, 10);
        System.out.println("Sum of two integers: " + sum1);
        
        double sum2 = op.add(2.5, 3.5, 4.5);
        System.out.println("Sum of three doubles: " + sum2);
        
        String combined = op.add("Hello, ", "world!");
        System.out.println("Concatenated string: " + combined);
    }
}
