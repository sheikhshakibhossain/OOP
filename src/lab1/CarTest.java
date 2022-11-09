package lab1;

import java.util.Scanner;

public class CarTest {

    public static void main(String[] args) {
        CarGame car = new CarGame("ford");
        CarGame.color = "Orange";
        Scanner sc = new Scanner(System.in);
        sc.close();

        while(car.cordX<=100 && car.cordX>=0 && car.cordY<=100 && car.cordY>=0) {

        }
    }

}
