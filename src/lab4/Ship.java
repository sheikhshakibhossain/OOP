package lab4;

import lab4.F18;

public class Ship {

    F18[] fa18 = new F18[10]; // stack a reference var. create korlam
    // fa18[0] = new F18(); // heap a object banay fa18[0] (stack) var. a point koralam
    public Ship() {
        for (int i = 0; i < 10 ; i++) {
            fa18[i] = new F18();
        }
    }
}
