package lab4;

public class Driver {
    public static void main(String[] args) {
        Soldier soldier = new Soldier();
        soldier.charge();
        Soldier soldier2 = new Soldier();
        soldier2.charge();

        Infantry infantry = new Infantry();
        System.out.println(infantry); // infantry te giye this k print korteche

        String str = String.valueOf(infantry);
        System.out.println(str.split("@")[1]);

        Soldier inf = new Infantry();
        System.out.println(inf);
        // inf.walk(); // infanry class er kichu access pabo na
        inf.charge();
        inf.swingTheSword();

        Soldier cav = new Cavalry();
        cav.swingTheSword(); // cavalry class er overrided method ta kaj korbe
    }
}
