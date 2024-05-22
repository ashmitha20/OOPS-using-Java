/*1.Create an abstract class Bank with methods credit amount, debit amount, get balance. 
Create three classes SBI, Federal, Canara from Bank. 
Using menu driven program, create account in all three banks and show demo operations credit, debit and balance in all three banks */

import java.util.*;

abstract class Bank {
    void creditamount(float x) {
        System.out.println("Credited Amount is : " + x);
    }

    void debitamount(float y) {
        System.out.println("Debited amount: " + y);
    }

    void getbalance(float x, float y) {
        float balance = x - y;
        System.out.println("The current Balance is :" + balance);
    }
}

class SBI extends Bank {
    public void creditamount(float x) {
        System.out.println("Credited Amount is: " + x);
    }

    public void debitamount(float y) {
        System.out.println("Debited amount: " + y);
    }

    public void getbalance(float x, float y) {
        float balance = x - y;
        System.out.println("The current Balance is :" + balance);
    }
}

class Federal extends Bank {
    public void creditamount(float x) {
        System.out.println("Credited Amount is: " + x);
    }

    public void debitamount(float y) {
        System.out.println("Debited amount: " + y);
    }

    public void getbalance(float x, float y) {
        float balance = x - y;
        System.out.println("The current Balance is :" + balance);
    }
}

class Canara extends Bank {
    public void creditamount(float x) {
        System.out.println("Credited Amount is: " + x);
    }

    public void debitamount(float y) {
        System.out.println("Debited amount: " + y);
    }

    public void getbalance(float x, float y) {
        float balance = x - y;
        System.out.println("The current Balance is :" + balance);
    }
}

public class Qn1 {
    public static void main(String[] args) {
        try {
            int i;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("\nMenu\n1.SBI\n2.Federal\n3.Canara\n4.Exit\n");
                System.out.println("Enter your choice : ");
                i = sc.nextInt();
                switch (i) {
                    case 1:
                        SBI s = new SBI();
                        System.out.println("\nEnter the Credit and Debit amounts:\n");
                        float cre = sc.nextFloat();
                        float deb = sc.nextFloat();
                        s.creditamount(cre);
                        s.debitamount(deb);
                        s.getbalance(cre, deb);
                        break;
                    case 2:
                        Federal f = new Federal();
                        System.out.println("\nEnter the Credit and Debit amounts:\n");
                        float cred = sc.nextFloat();
                        float debi = sc.nextFloat();
                        f.creditamount(cred);
                        f.debitamount(debi);
                        f.getbalance(cred, debi);
                        break;
                    case 3:
                        Canara c = new Canara();
                        System.out.println("\nEnter the Credit and Debit amounts:\n");
                        float credi = sc.nextFloat();
                        float debit = sc.nextFloat();
                        c.creditamount(credi);
                        c.debitamount(debit);
                        c.getbalance(credi, debit);
                        break;
                    default:
                        System.out.println("\nWrong Choice!! Please Enter Again \n");
                }
            } while (i != 4);
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch exception occurred.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }}

    

    
    



 












