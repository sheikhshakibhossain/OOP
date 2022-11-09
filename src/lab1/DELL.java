package lab1;

public class DELL {

    boolean state;
    long memory;
    double clockSpeed;
    double hddStorage;
    static String OS;

    @Override
    public String toString() {
        return "DELL{" +
                "state=" + state +
                ", memory=" + memory +
                ", clockSpeed=" + clockSpeed +
                ", hddStorage=" + hddStorage +
                ", OS='" + OS + '\'' +
                '}';
    }

    public DELL() {
        // default constructor
        System.out.println("New DELL PC is constructing");
    }

    public DELL(boolean state /*S*/, long memory, double clockSpeed, double hddStorage, String OS) {
        // state = S;
        this.state = state;
        this.memory = memory;
        this.clockSpeed = clockSpeed;
        this.hddStorage = hddStorage;
        DELL.OS = OS;
    }
    
    public void pressBotton() {
        // if (state) {
        //     state = false;
        // } else {
        //     state = true;
        // }
        state = !state;
    }
}