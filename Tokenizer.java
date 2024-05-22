import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[] args) {
        int n, sum = 0;
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter numbers with , in between: ");
        try {
            s = br.readLine();
            StringTokenizer st = new StringTokenizer(s, ",");
            while (st.hasMoreTokens()) {
                String temp = st.nextToken();
                n = Integer.parseInt(temp);
                System.out.println(n);
                sum += n;

            }
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}
//Always put try catch