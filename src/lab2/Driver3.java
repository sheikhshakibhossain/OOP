package lab2;

public class Driver3 {
    public static void main(String[] args) {
        Toyota.numOfDoors = 4;
        Audi.numOfDoors = 2;

        if (Toyota.numOfDoors > Audi.numOfDoors) {
            System.out.println("Toyotta has more doors than Audi");
        }

        Toyota toyota = new Toyota("Black");
        Toyota toyota2 = new Toyota("White");
        System.out.println(toyota.numOfDoors);
        System.out.println(toyota.color);

        Audi audi = new Audi("Red", 4);
        System.out.println(audi.numOfTires == toyota2.numOfDoors);
    }
}
