import java.util.*;
import java.io.*;

abstract class Compartment {
    public abstract void notice();
}

class FirstClass extends Compartment {
    int t = 100;

    void booking(int x) {
        t = t - x;
    }

    public void notice() {
        System.out.println("Available seats: " + t);
    }
}

class GeneralClass extends Compartment {
    int tg = 100;

    void booking(int y) {
        tg = tg - y;
    }

    public void notice() {
        System.out.println("Available seats: " + tg);
    }

}

public class Abstract {

    public static void main(String[] args) {
        FirstClass f = new FirstClass();
        f.booking(10);
        f.notice();
        GeneralClass g = new GeneralClass();
        g.booking(10);
        g.notice();
    }
}
