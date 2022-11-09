package lab4;

public class F35 extends FighterJet {

    Pilot pilot1 = new Pilot();
    Engine engine1 = new Engine();

    @Override
    public void maneuver() {
        System.out.println(
                "Cobra maneuver"
        );
    }
}
