package lab5;

public class ExceptionHandling {
    
    public static void main(String[] args) {
        
        System.out.println("print 1");
        try {
            System.out.println("The number is: " + 9/0 );
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("print 2 after exception");
    }
}
