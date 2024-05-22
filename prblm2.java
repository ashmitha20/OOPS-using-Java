import java.io.*;
import java.util.StringTokenizer;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class prblm2 {

    public static void main(String[] args) {
        try {
            // Step 1: Read data from "input.txt"
            Employee[] employees = readDataFromFile("input.txt");
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            int numEntries = Integer.parseInt(reader.readLine().trim());
           

        for (int i = 0; i < numEntries; i++) {
            String line = reader.readLine();
            StringTokenizer tokenizer = new StringTokenizer(line, ",");
            String name = tokenizer.nextToken().trim();
            double salary = Double.parseDouble(tokenizer.nextToken().trim());
            employees[i] = new Employee(name, salary);
        }

        reader.close();
        return employees;
    }


            // Step 2: Sort data based on salaries in ascending order using bubble sort
            bubbleSort(employees);

            // Step 3: Write the sorted list to "output.txt" along with the total number of
            // entries
            writeDataToFile("output.txt", employees);

            System.out.println("Sorting and writing to file successful.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Employee[] readDataFromFile(String fileName) throws IOException {
       
    private static void bubbleSort(Employee[] employees) {
        int n = employees.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (employees[j].salary > employees[j + 1].salary) {
                    // swap temp and employees[i]
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }
    }

    private static void writeDataToFile(String fileName, Employee[] employees) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(fileName));

        for (Employee employee : employees) {
            writer.println(employee.name + ", " + employee.salary);
        }

        writer.println("\nTotal entries: " + employees.length);

        writer.close();
    }
}