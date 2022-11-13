package lab5;

public class ExceptionHandling {
    
    public static void main(String[] args) {
        
        int x = 30, y = 0;
        System.out.println("print 1 before error");
        try {
            System.out.println("The number is (try): " + x/y );
        } catch(Exception e) {
            // e.printStackTrace();
            // System.out.println(e.getMessage());
            System.out.println("The number is (catch): " + x/0.0000001 );
        }
        System.out.println("print 2 after exception");
    }
}
