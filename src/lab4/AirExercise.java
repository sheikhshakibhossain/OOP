package lab4;

import java.util.Scanner;

public class AirExercise {
    public static void main(String[] args) {
        F35 f35 = new F35();
        F18 f18 = new F18();

        f35.maneuver();
        f18.maneuver();

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();


    }
}
