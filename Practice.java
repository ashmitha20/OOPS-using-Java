/* Swapping
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter a: \n");
        int a = sc.nextInt();
        System.out.println("Enter b: \n");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped values: \na: " + a + "\nb: " + b);
    }

}*/
/* Even Odd
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter a: \n");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
} */
/*Factorial 
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter a: \n");
        int a = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <= a; i++) {
            fact = fact * i;
        }
    System.out.println("Factorial of "+a+" is :"+fact);
    }
}
with recursion
return a*fact(a-1);
*/
/* Fibonacci
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter limit: \n");
        int limit = sc.nextInt();
        System.out.print("Fibonacci series upto ");
        int a = 0;
        int b = 1;
        System.out.println(a + " ");
        System.out.println(b + " ");
        for (int i = 3; i <= limit; i++) {
            int c = a + b;
            System.out.println(c + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}
with recursion
 public class Practice {
    public static void main(String[] args) {
        int n= 10;
        for(int i = 0; i < n; i++) {
            int res= fib(i);
            sopln(res);
        }
    }
    static int fib(int k) {
        if (k == 0) return 0;
        if(k == 1|| k == 2) return 1;
        else return fib(a-1)+fib(a-2);
*/

/*Prime 
import java.util.*;
import java.math.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter a: \n");
        int a = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}*/

/*Palindrome 
import java.util.*;
import java.math.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter a string: ");
        String st = sc.nextLine();
        int len = st.length();
        boolean isPali = true;
        for (int i = 0; i < len / 2; i++) {
            if (st.charAt(i) != st.charAt(len - i - 1)) {
                isPali = false;
                break;
            }
        }
        if (isPali) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
*/

/*Pattern
 right angled: loop: for(i = 1 ; i <= lim; i++) {
    for(j = 0; j < i; j++) {
        sopln("*");
 pyramid: for(i = 1 ; i <= lim; i++) {
    for(j = 0; j < lim-i; j++) {
        Sop(" ");
    }
    for(k=1; k <= i; k++) {
        Sop("*");
    }
}
    }
 }
 */

 /*To read a character char c = sc.nextLine().charAt(0); */

