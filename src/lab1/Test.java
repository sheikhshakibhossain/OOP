package lab1;

public class Test {
    public static void main(String[] args) {
        
        new DELL(); // makes but no catch
        DELL temp = new DELL();
        temp.pressBotton();

        DELL dell = new DELL(false, 4096, 4.2, 512000, "Windows");
        dell.pressBotton();
        System.out.println(dell);

        DELL dell2;
        dell2 = new DELL(false, 1024, 3.6, 256000, "Linux");
        dell2.pressBotton();
        System.out.println(dell2);

        DELL.OS = "Ubuntu";
        System.out.println(dell);
        System.out.println(dell2);
    }
    
}