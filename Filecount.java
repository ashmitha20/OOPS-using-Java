import java.io.*;

public class Filecount {
    public static void main(String[] args) throws IOException {
        try {
            FileReader f = new FileReader("Input.txt");
            int a, count = 0;
            do {
                a = f.read();
                if (a != -1) {
                    count++;
                }
            } while (a != -1);
            System.out.println("Number of lines in the file is : " + (count));
            f.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
