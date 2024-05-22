/*Create a class student with attributes Name Register number, Branch and total mark write a menu to create 3 constructors to store the details of 3 students according to the given categories:
Category 1 : student with no details or attributes given
Category 2 : student with only the name attribute
Category 3 : student with all the details. 
Also print the rank list of the students based on total mark . */

import java.util.*;

class Student {
    String name;
    int regno;
    String branch;
    double tot;

    Student() {

    }

    Student(String n) {
        name = n;
    }

    Student(String n, int reg, String brnch, double total) {
        name = n;
        regno = reg;
        branch = brnch;
        tot = total;
    }
//Difference
    public String getName() {
        return name;
    }

    public int getRegisterNumber() {
        return regno;
    }

    public String getBranch() {
        return branch;
    }

    public double getTotalMarks() {
        return tot;
    }
}

public class Qn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.println("1. No details");
            System.out.println("2. Only name");
            System.out.println("3. All details");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    s[i] = new Student();
                    break;
                case 2:
                    System.out.println("Enter name: ");
                    String nm = sc.nextLine();
                    s[i] = new Student(nm);
                    break;
                case 3:
                    System.out.println("Enter name: ");
                    String n = sc.nextLine();
                    System.out.println("Enter reg no: ");
                    int r = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Branch: ");
                    String br = sc.nextLine();
                    System.out.println("Enter Total Marks: ");
                    double tot = sc.nextDouble();
                    s[i] = new Student(n, r, br, tot);
                    break;
                default:
                    System.out.println("Invalid choice. Defaulting to no details.");
                    s[i] = new Student();
            }
        }
        //Imp
        Arrays.sort(s, Comparator.comparingDouble(Student::getTotalMarks).reversed());
        System.out.println("\nRank List:");
        System.out.println("Rank\tName\t\tRegister Number\tBranch\t\tTotal Marks");
        for (int j = 0; j < 3; j++) {
            System.out.println((j + 1) + "\t" + s[j].getName() + "\t\t" + s[j].getRegisterNumber() + "\t\t"
                    + s[j].getBranch() + "\t\t" + s[j].getTotalMarks());
        }
    }
}
