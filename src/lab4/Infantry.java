package lab4;

public class Infantry extends Soldier {
    public void walk() {
        System.out.println();
    }

    @Override
    public void swingTheSword() {
        System.out.println(
                "Charging with spike"
        );
    }
}