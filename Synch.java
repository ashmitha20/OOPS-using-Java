
class EvenOdd {
    synchronized void even() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    synchronized void odd() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

class T1 extends Thread {
    EvenOdd e1;

    T1(EvenOdd e) {
        e1 = e;
    }

    public void run() {
        e1.even();
    }
}

class T2 extends Thread {
    EvenOdd o;

    T2(EvenOdd o1) {
        o = o1;
    }

    public void run() {
        o.odd();
    }
}

class ThreadSynch {
    public static void main(String[] args) {
        EvenOdd eo = new EvenOdd();
        T1 t = new T1(eo);
        T2 t2 = new T2(eo);
        t.start();
        t2.start();
    }
}
