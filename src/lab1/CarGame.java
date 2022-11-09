package lab1;

public class CarGame {
    static String color = "Orange";
    String brand;

    public CarGame(String brand) {
        this.brand = brand;
    }

    int cordX = 0;
    int cordY = 0;
    int velocity = 5;

    public void move(int cordX, int cordY) {
        this.cordX = cordX;
        this.cordY = cordY;
    }

    public void moveUp() {
        cordY += velocity;
        cordY += velocity;
    }

    public void moveDown() {
        cordX--;
        cordY--;
    }

    public void moveLeft() {
        cordX -= 2;
    }

    public void moveRight() {
        cordX += 2;
    }
}
