/*Constructor 
import java.util.*;

class Box {
    int l;
    int w;
    int h;

    Box() {
        l = -1;
        w = -1;
        h = -1;
    }

    Box(int x, int y, int z) {
        l = x;
        w = y;
        h = z;
    }

    Box(int a) {
        l = a;
        w = a;
        h = a;
    }

    void Volume() {
        int vol = l * w * h;
        System.out.println("Volume: " + vol);
    }
}

public class Coreconcepts {
    public static void main(String[] args) {
        Box b = new Box();
        b.Volume();
        Box b1 = new Box(1, 2, 3);
        b1.Volume();
        Box b2 = new Box(4);
        b2.Volume();
    }
}*/
/*Method Overloading 
import java.util.*;

class Box {

    void Area(double r) {
        double area = Math.PI * r * r;
        System.out.println("Area: " + area);
    }

    void Area(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }

    void Area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area: " + area);
    }
}

public class Coreconcepts {
    public static void main(String[] args) {
        Box b = new Box();
        b.Area(2);
        b.Area(2, 4);
        b.Area(5, 6, 7);
    }
}*/
/* Inheritance
import java.util.*;

class Employee {
    String name;
    int age;
    long phno;
    String addrs;
    double sal;

    void printSalary() {
        System.out.println("Salary: " + sal);
    }
}

class Manager extends Employee {
    String dep;

    void department() {
        System.out.println("Department: " + dep);
    }
}

class Officer extends Employee {
    String spec;

    void Specialization() {
        System.out.println("Specialization: " + spec);
    }
}

public class Coreconcepts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager m = new Manager();
        System.out.println("Enter Salary: \n");
        m.sal = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Department: \n");
        m.dep = sc.nextLine();
        m.printSalary();
        m.department();
        Officer o = new Officer();
        System.out.println("Enter Salary: \n");
        o.sal = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Specialization: \n");
        o.spec = sc.nextLine();
        o.printSalary();
        o.Specialization();
    }
}*/
/*super is used when there is a constructor Employee(String n, long pno, int a..)
 * and we have to call those in extended class Officer{ officer(String, ..)
 * super(n,pno,a...) and spec;}
 */
/*Abstract class 
import java.util.*;

abstract class Shape {
    void numberOfSides() {

    }
}

class Rectangle extends Shape {
    void numberOfSides() {
        System.out.println("A rectangle has four sides.");
    }
}

class Triangle extends Shape {
    void numberOfSides() {
        System.out.println("A triangle has three sides.");
    }
}

class Hexagon extends Shape {
    void numberOfSides() {
        System.out.println("A hexagon has six sides.");
    }
}

class Coreconcepts {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.numberOfSides();

        Triangle t = new Triangle();
        t.numberOfSides();

        Hexagon h = new Hexagon();
        h.numberOfSides();
    }
}*/

/*multi inheritance class extends another subclass
 * class box {....create void display}
 * class weightedbox extends box{....void display{ super.display(); and additional}}
 * class  colorbox extends weightedbox{...void display{ super.display(); and additional}
 */

/*Core concepts
import java.util.*;

public class Coreconcepts {
   public static void main(String[] args) {
       int n;
       n = Integer.parseInt(args[0]);
       int pr = 0;
       for (int i = 2; i <= n/2; i++) {
           if (n % i == 0) {
               pr++;
               break;
           }
       }
       if (pr > 0) {
           System.out.println("Not Prime");
       } else {
           System.out.println("Prime");
       }
   }
} */

/*Min bal Exception 

import java.util.*;

class Bank {
    int accno;
    String name;
    int bal;

    void display() {
        System.out.println(name);
        System.out.println(accno);
        System.out.println(bal);
    }
}

class Banktrans extends Bank {
    void checkbal() throws Exception {
        if (bal < 1000) {
            throw new Exception("Insufficient Balance");
        } else {
            System.out.println("Balance is sufficient");
        }
    }

    void withdraw(int t) {
        bal = bal - t;
    }

    void deposit(int d) {
        bal = bal + d;
    }
}

public class Coreconcepts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banktrans b = new Banktrans();
        b.name = "Anna";
        b.accno = 1234567890;
        b.bal = 2000;
        b.deposit(1000);
        b.withdraw(500);
        b.display();
        try {
            b.checkbal();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
*/
/*File copying and writing 
import java.util.*;
import java.io.*;

public class Coreconcepts {
    public static void main(String[] args) {
        try {
            FileInputStream f1 = new FileInputStream("ip.txt");
            FileOutputStream f2 = new FileOutputStream("op.txt");
            int a;
            do {
                a = f1.read();
                if (a != -1) {
                    System.out.print((char) a);
                    f2.write((char) a);
                }
            } while (a != -1);
            f1.close();
            f2.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
to find count if(a != -1) { count++ }
Sop(count-2)
*/

/*IE  
import java.util.*;
import java.io.*;

class Author {
    String name;
    String email;
    char gender;

    Author(String n, String e, char g) {
        name = n;
        email = e;
        gender = g;
    }
}

class Book {
    String name;
    Author author;
    double price;
    int qty;

    Book(String n, Author a, double pr, int q) {
        name = n;
        author = a;
        price = pr;
        qty = q;
    }
}

class Coreconcepts {
    public static void main(String[] args) {
        Author au = new Author("John Doe", "john@doe.com", 'M');
        Book bk = new Book("Java: The Complete Reference", au, 59.99, 4);
        System.out.println("\nName of the book : " + bk.name + "\nAuthor's Name : " + bk.author.name +
                "\nEmail of the author : " + bk.author.email + "\nGender of Author: " + bk.author.gender
                + "\nBook price: " + bk.price + "\nBooks in stock: " + bk.qty);
    }
}
*/

/*IE 
import java.util.*;

abstract class Compartment {
    public abstract void notice();
}

class FirstClass extends Compartment {
    int t = 100;

    public void book(int x) {
        t = t - x;
    }

    public void notice() {
        System.out.println("Available: " + t);
    }
}

class GeneralClass extends Compartment {
    int tt = 200;

    public void book(int y) {
        tt = tt - y;
    }

    public void notice() {
        System.out.println("Available: " + tt);
    }
}

class Coreconcepts {
    public static void main(String[] args) {
        FirstClass fc = new FirstClass();
        fc.book(50);
        fc.notice();
        GeneralClass gc = new GeneralClass();
        gc.book(50);
        gc.notice();
    }
} */

/* String Tokenizer
import java.util.*;
import java.util.StringTokenizer;

public class Coreconcepts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        System.out.println("Enter integers with, in between: ");
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, ",");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum += n;
        }
        System.out.println("Sum of entered numbers is : " + sum);
    }
}*/

/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * a = Integer.parseInt(br.readLine());*/

/*Thread 
import java.util.*;

class EvenOdd {
    synchronized void odd() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }
    }

    synchronized void even() {
        for (int j = 2; j <= 10; j += 2) {
            System.out.println(j);
        }
    }
}

class T1 extends Thread {
    EvenOdd e1;

    T1(EvenOdd e) {
        e1 = e;
    }

    public void run() {
        e1.odd();
    }
}

class T2 extends Thread {
    EvenOdd e2;

    T2(EvenOdd eo) {
        e2 = eo;
    }

    public void run() {
        e2.even();
    }
}

public class Coreconcepts {
    public static void main(String[] args) {
        EvenOdd e = new EvenOdd();
        T1 t1 = new T1(e);
        t1.start();
        T2 t2 = new T2(e);
        t2.start();
    }
}*/
/* 
import java.util.*;
class Node {
    int data;
    Node next;
    Node prev;

    Node(int d) {
        data = d;
        prev = null;
        next = null;
    }
}
class LinkedList {
    Node head;
    Node temp = head;
    public void insertfront(int da) {
        Node newnode = new Node(da);

        if(head == null) {
            head = newnode;
            return;
        }
        else {
            newnode.next = temp;
            temp.prev = newnode;
            head = newnode;
        }
    }
    public void insertend(int da) {
        Node newnode = new Node(da);
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.prev = temp;
    }
    //same
}*/

/*Quick sort 
import java.util.*;

public class Coreconcepts {
    public static int partition(int a[], int low, int high) {
        int pivot = a[high];
        int i = low - 1;
        for (int j = low; j <= high; j++) {
            if (a[j] < pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        int temp2 = a[i];
        a[i] = a[high];
        a[high] = temp2;
        return i;
    }

    public static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pid = partition(a, low, high);
            quickSort(a, low, pid - 1);
            quickSort(a, pid + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[50];
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        quickSort(a, 0, n - 1);
        System.out.print("The sorted array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
*/
