import java.io.*;
import java.util.*;

class Employee {
    String name;
    int salary;

    Employee(String n, int sal) {
        this.name = n;
        this.salary = sal;
    }
}

public class file {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            PrintWriter pw = new PrintWriter(new FileWriter("output.txt", true));

            int numEmp = Integer.parseInt(br.readLine());
            Employee emp[] = new Employee[numEmp];

            for (int i = 0; i < numEmp; i++) {
                String line = br.readLine();
                String arr[] = line.split(",");
                if (arr.length != 2) {
                    System.out.println("Error: Invalid input format in line " + (i + 1));
                    br.close();
                    pw.close();
                    return;
                }
                emp[i] = new Employee(arr[0], Integer.parseInt(arr[1]));
            }

            boolean swapped;
            do {
                swapped = false;
                for (int j = 0; j < numEmp - 1; j++) {
                    if (emp[j].salary < emp[j + 1].salary) {
                        Employee temp = emp[j];
                        emp[j] = emp[j + 1];
                        emp[j + 1] = temp;
                        swapped = true;
                    }
                }
            } while (swapped);

            for (int i = 0; i < numEmp; i++) {
                pw.println(emp[i].name + "  " + emp[i].salary);
            }

            br.close();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error: IOException occurred");
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Error: Invalid number format in salary");
        }
    }
}
