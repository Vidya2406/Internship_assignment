import java.util.Scanner;

public class ATM_Interface {

    public static int amountwithdrawing(int withdrawamount, int balance) {
        System.out.println("Amount Withdrawing Action is taking place");
        System.out.println("Withdrawing amount from the bank is: " + withdrawamount);
        if (balance >= withdrawamount) {
            balance = balance - withdrawamount;
            System.out.println("Customer is kindly requested to collect the money as well as card...Thank you");
            displaybalance(balance);
        }
        else 
            System.out.println("Customer is not having sufficient balance to withdraw the amount...Thank you");

        return balance;

    }

    public static void displaybalance(int balance) {
        System.out.println("Amount Balance checking Action is taking place");
        System.out.println("The balance in the account is " + balance);
    }

    public static int amountdepositing(int depositamount, int balance) {
        System.out.println("Amount Depoiting Action is taking place");
        System.out.println("Depositing amount in the bank is:" + depositamount);
        balance = balance + depositamount;
        System.out.println(("The customers amount is deposited in the bank account...Thank you"));
        displaybalance(balance);
        return balance;

    }

    public static void main(String[] args) {
        int withdrawamount = 1000;
        int depositamount = 10000;
        int balance = 20000;

        displaybalance(balance); // displaying the balance operation
        balance = amountdepositing(depositamount, balance); // displaying depositing operation
        balance = amountwithdrawing(withdrawamount, balance); // displaying withdrawing operation

    }
}