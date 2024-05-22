import java.util.*;
import java.lang.Math;
import java.io.*;

public class BR {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c;
        double s, area;
        try {
            System.out.println("Enter the sides of triangle: ");
            a = Integer.parseInt(br.readLine());
            b = Integer.parseInt(br.readLine());
            c = Integer.parseInt(br.readLine());
            s = (a + b + c) / 2.0;
            area = Math.sqrt((s - a) * (s - b) * (s - c));
            System.out.println("Area: " + area);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
