/*Create a Java program that reads data from a file named "input.txt" containing a list of names and their corresponding salaries. Implement exception handling for file operations. Sort the data based on salaries in ascending order and write the sorted list along with the total number of entries to a new file named "output.txt." */

import java.io.*;
import java.util.*;

public class prblm1 {
    public static void main(String[] args) {
        try {
            String employees[];
            int salary[];
           PrintWriter o = new PrintWriter("output.txt");
            o.print("Employee");
            o.print("Salary");
            o.println();
           Scanner sc = new Scanner(new File("input.txt"));
           sc.nextLine();
           while(sc.hasNextLine()) {
            String curr = sc.nextLine();
            StringTokenizer st = new StringTokenizer(curr," ");
            while(st.hasMoreTokens()) {
                String token = st.nextToken();
                if(!token.equalsIgnoreCase("name")){
                     salary=Integer.parseInt(token);
                     
            }
        }
    }


           }

