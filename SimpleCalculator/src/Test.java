public class Test {
    int x=10, y=20;
    void a() {
        System.out.println("prining a");
    }
    

    @Override
    public String toString() {
        return "Test{x=" + x + ", y=" + y + "}";
    }


    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println(obj);
    }
}
