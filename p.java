import java.util.*;
import java.io.*;

class Prime {
    synchronized void prime() {
        try {
            int start = 1;
            int end = 100;
            for (int num = start; num <= end; num++) {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(num);
                    notify();
                    wait();
                }

            }
        } catch (Exception e) {
            System.out.print("Error occurred: ");
        }
    }
}

class Fibonacci {
    synchronized void fib() {
        try {
            int lim = 100;
            int fir = 0, sec = 1;
            System.out.print(fir + " " + sec + " ");
            for (int i = 3; i <= lim; i++) {
                int next = fir + sec;
                System.out.print(next + " ");
                fir = sec;
                sec = next;
                notify();
                wait();

            }
        } catch (Exception e) {
            System.out.println("Error in printing Fibonacci series");
        }
    }
}

class T1 extends Thread {
    Prime p1;

    public T1(Prime op) {
        p1 = op;
    }

    public void run() {
        p1.prime();
    }
}

class T2 extends Thread {
    Fibonacci f;

    public T2(Fibonacci fo) {
        f = fo;
    }

    public void run() {
        f.fib();
    }
}

public class p {
    public static void main(String[] args) {
        Prime pr = new Prime();
        T1 t = new T1(pr);
        t.start();
        Fibonacci fi = new Fibonacci();
        T2 ta = new T2(fi);
        ta.start();
    }
}
