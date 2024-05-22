/*Write a program to accept two matrices from the user as a and b and perform Matrix multiplication and store the result in Matrix c
Write the Matrix a, Matrix b and product Matrix c into a file with name matrix.txt */

import java.util.*;
import java.io.*;

public class Qn4 {
    public static void main(String[] args) throws Exception {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the rows and columns of first matrix: ");
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            int a[][] = new int[r1][c1];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter the rows and columns of second matrix: ");
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();
            int b[][] = new int[r2][c2];
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    b[i][j] = sc.nextInt();
                }
            }
            if (c1 != r2) {
                System.out.println("Matrix multiplication not possible");
            } else {
                int res[][] = new int[r1][c2];
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c2; j++) {
                        for (int k = 0; k < r2; k++) {
                            res[i][j] += a[i][k] * b[k][j];
                        }
                    }
                }
                FileWriter fw = new FileWriter("output.txt");
                fw.write("Matrix A:\n");
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c1; j++) {
                        fw.write(a[i][j] + " ");
                    }
                    fw.write("\n");
                }
                fw.write("\nMatrix B:\n");
                for (int i = 0; i < r2; i++) {
                    for (int j = 0; j < c2; j++) {
                        fw.write(b[i][j] + " ");
                    }
                    fw.write("\n");
                }
                fw.write("\nResultant Matrix:\n");
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c2; j++) {
                        fw.write(res[i][j] + " ");
                    }
                    fw.write("\n");
                }
                fw.close();
            }
        } catch (IOException e) {
            System.out.println("Error in writing to file");
        }
    }
}
