import java.io.*;

public class fileops {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("Input.txt");
        FileWriter fw = new FileWriter("Output.txt");
        int character;
        while ((character = fr.read()) != -1) {
            fw.write(character);
        }
        fr.close();
        fw.close();
    }
}
