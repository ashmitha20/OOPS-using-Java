
/*Simulate a race between A and B where A is 2 times faster than B and B runs at any specified speed , the race distance is also inputted and the final result is written in the format :
Winner      time taken     speed 


Do this using the concept of threads and make sure that the output of each thread is not just random but in the order " distance travelled by A
Distance travelled by B" */
import java.io.*;

class Race {
    int speeda;
    int speedb;
    int distance;
    int time;

    Race(int sb, int d) {
        speeda = 2 * sb;
        speedb = sb;
        distance = d;
    }

    synchronized int A() {
        time = distance / speeda;
        return time;

    }

    synchronized int B() {
        time = distance / speedb;
        return time;

    }

}

class T1 extends Thread {
    FileWriter f;
    Race ra;

    T1(Race a, FileWriter b) throws IOException {
        ra = a;
        f = b;
    }

    public void run() {
        int timeA = ra.A();
        try {

            f.write("A\t\t" + timeA + "seconds\t\t" + ra.speeda + "\n");
            f.close();
        } catch (IOException e) {
            System.out.println("Error!");
        }

    }
}

class T2 extends Thread {
    FileWriter f;
    Race ro;

    T2(Race o, FileWriter b) throws IOException {
        ro = o;
        f = b;
    }

    public void run() {
        int timeB = ro.B();
        try {

            f.write("B\t\t" + timeB + "seconds\t\t" + ro.speedb + "\n");
            f.close();
        } catch (IOException e) {
            System.out.println("Error!");
        }

    }
}

public class challenge {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("Winner.txt");
        Race r1 = new Race(50, 340);
        Race r2 = new Race(60, 280);
        T1 t1 = new T1(r1, fw);
        T2 t2 = new T2(r2, fw);

        fw.write("Winner\t\tTime Taken\t\tSpeed\n");
        fw.write("\n-----------------------------------------\n");
        t1.start();
        t2.start();
    }
}
