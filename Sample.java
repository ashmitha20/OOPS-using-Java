
/*Create a class Student, which has regNum,
name, date of birth and marks of 3 subjects (each subject having max marks of
100) as members. It should contain methods to read display the marks and
compute the total. Total marks are calculated as sum of the 3 subject marks and
converted to fall within 100. Write appropriate constructor for the student
which assigns values to the members.  Enter the details of n students in below
format to a file such that the students are sorted based on their register
number:


===================================================================


Student
Name                 DOB                     Register Number            Total Marks


===================================================================


Ram                                   30/08/2008        1234                                  90


Sheila                                25/09/2008        2345                                  75


Preetham                         02/05/2008        4567                                  88


=================================================================== 
import java.util.*;
import java.io.*;

class Student {
    int regnum;
    String name;
    String dob;
    int m1;
    int m2;
    int m3;
    int total;

    Student(String n, int reg, String DO) {
        name = n;
        regnum = reg;
        dob = DO;
    }

    public void read(int mar1, int mar2, int mar3) {
        m1 = mar1;
        m2 = mar2;
        m3 = mar3;
    }

    public void total() {
        int sum = m1 + m2 + m3;
        int tot = sum / 3;
        System.out.println(tot);

    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.print("Registration Number: " + regnum);
        System.out.println("Date Of Birth: " + dob + "\n");
        System.out.print("Marks in 1: " + m1);
        System.out.print("\t Marks in 2: " + m2);
        System.out.println("\t Marks in 3: " + m3);
    }
}

public class Sample {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Student[] s = new Student[3];
            FileWriter fw = new FileWriter("Students.txt");
            fw.write("=========================================================\n");
            fw.write("Student name\t\tDOB\t\tRegNo\t\tTotal marks\n");
            for (int i = 0; i < 3; i++) {
                System.out.println("Reg no: ");
                int rno = sc.nextInt();
                sc.nextLine();
                System.out.println("Name: ");
                String n = sc.nextLine();
               
                System.out.println("Date of birth(dd/mm/yyyy): ");
                String db = sc.nextLine();
               
                System.out.println("Mark1: ");
                int m1 = sc.nextInt();
                System.out.println("Mark2: ");
                int m2 = sc.nextInt();
                System.out.println("Mark3: ");
                int m3 = sc.nextInt();

                s[i] = new Student(n, rno, db);
                s[i].read(m1, m2, m3);
                s[i].total();

            }
            sc.close();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3 - i - 1; j++) {
                    if (s[j].regnum > s[j + 1].regnum) {
                        int temp = s[j].regnum;
                        s[j].regnum = s[j + 1].regnum;
                        s[j + 1].regnum = temp;

                        String tempname = s[j].name;
                        s[j].name = s[j + 1].name;
                        s[j + 1].name = tempname;

                        String tempdob = s[j].dob;
                        s[j].dob = s[j + 1].dob;
                        s[j + 1].dob = tempdob;

                        int temptot = s[j].total;
                        s[j].total = s[j + 1].total;
                        s[j + 1].total = temptot;
                    }
                }
            }

            for (int i = 0; i < 3; i++) {
                fw.write((s[i].regnum));
                fw.write("\t\t\t\t");
                fw.write(s[i].name);
                fw.write("\t\t\t");
                fw.write(s[i].dob);
                fw.write("\t\t\t");
                fw.write((s[i].total));
                fw.write("\n");
            }

            fw.write("=============================================================================\n");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}*/

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Children {
    String name;
    int regNum;
    String DOB;
    int mark1;
    int mark2;
    int mark3;
    int total;

    Children(String na, int rn, String d) {
        name = na;
        regNum = rn;
        DOB = d;
    }

    void read(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    void tot() {
        int sum = mark1 + mark2 + mark3;
        total = Math.min(sum, 100); // Ensuring total doesn't exceed 100
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Register Number: " + regNum);
        System.out.println("DOB: " + DOB);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
        System.out.println("Total marks: " + total);
    }
}

public class Sample {
    public static void main(String[] args) throws IOException {

        FileWriter fWriter = new FileWriter("Students.txt");
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = obj.nextInt();
        Children[] s = new Children[n];
        fWriter.write("=============================================================================\n");
        fWriter.write("REGISTER NUMBER\t\tSTUDENT NAME\t\tDOB\t\tTOTAL MARKS\n");
        fWriter.write("=============================================================================\n");

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Register Number: ");
            int rn = obj.nextInt();
            obj.nextLine();
            System.out.println("Enter Student Name: ");
            String na = obj.nextLine();
            System.out.println("Enter DOB: ");
            String d = obj.nextLine();
            System.out.println("Enter Mark 1: ");
            int m1 = obj.nextInt();
            System.out.println("Enter Mark 2: ");
            int m2 = obj.nextInt();
            System.out.println("Enter Mark 3: ");
            int m3 = obj.nextInt();

            s[i] = new Children(na, rn, d);3
            s[i].read(m1, m2, m3);
            s[i].tot();
        }

        // Sorting the array of students based on registration number
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (s[j].regNum > s[j + 1].regNum) {
                    // Swap registration numbers
                    int temp = s[j].regNum;
                    s[j].regNum = s[j + 1].regNum;
                    s[j + 1].regNum = temp;

                    // Swap other details
                    String tempName = s[j].name;
                    s[j].name = s[j + 1].name;
                    s[j + 1].name = tempName;

                    String tempDOB = s[j].DOB;
                    s[j].DOB = s[j + 1].DOB;
                    s[j + 1].DOB = tempDOB;

                    int tempTotal = s[j].total;
                    s[j].total = s[j + 1].total;
                    s[j + 1].total = tempTotal;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            fWriter.write(String.valueOf(s[i].regNum));
            fWriter.write("\t\t\t\t");
            fWriter.write(s[i].name);
            fWriter.write("\t\t\t");
            fWriter.write(s[i].DOB);
            fWriter.write("\t\t\t");
            fWriter.write(String.valueOf(s[i].total));
            fWriter.write("\n");
        }

        fWriter.write("=============================================================================\n");
        fWriter.close();
    }
}
