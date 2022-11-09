package lab4;

public class F18 extends  FighterJet {
    Pilot pilot1 = new Pilot();
    Pilot pilot2 = new Pilot();
    Engine engine1 = new Engine();
    Engine engine2 = new Engine();

    public F18() {}

    public F18(Pilot pilot1, Pilot pilot2, Engine engine1, Engine engine2) {
        this.pilot1 = pilot1;
        this.pilot2 = pilot2;
        this.engine1 = engine1;
        this.engine2 = engine2;
    }
}
