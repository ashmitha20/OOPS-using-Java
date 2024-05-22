
/*2.Read a line from user. 
If it contains a palindrome substring change it to asterisks (**) and write modified line to file */
import java.io.*;

public class Qn2 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a line:");
            String inputLine = reader.readLine();

            // Check for palindrome substring and replace with asterisks
            String modifiedLine = replacePalindromeWithAsterisks(inputLine);

            // Write modified line to file
            FileWriter writer = new FileWriter("modified_line.txt");
            writer.write(modifiedLine);
            writer.close();

            System.out.println("Modified line has been written to modified_line.txt");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Function to replace palindrome substring with asterisks
    private static String replacePalindromeWithAsterisks(String input) {
        StringBuilder modified = new StringBuilder(input);
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 2; j <= input.length(); j++) {
                String substr = input.substring(i, j);
                if (isPalindrome(substr)) {
                    for (int k = i; k < j; k++) {
                        modified.setCharAt(k, '*');
                    }
                }
            }
        }
        return modified.toString();
    }

    // Function to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
