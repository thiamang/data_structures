import java.lang.String;
import java.lang.System;

//bank.java
//demonstrates basic OOP syntax
///////////////////////
class BankAccount
{
    private double balance;  //account balance

    public BankAccount(double openningBalance) //constructor
    {
        balance=openningBalance;
    }

    public void deposit (double amount) // makes deposit
    {
        balance= balance + amount;
    }

    public void withdraw (double amount)
    {
        banalce=balance - amount;
    }
    public void display()
    {
        System.out.println("balance=" + balance);
    }
} // End class for bank account

class BankApp
{
    public static void main(String[] args)
    {
        BankAccount bal1= new BankAccount(100); //create account
        System.out.println("Before transactions, ");
        bal1.display(); //display balance
        bal1.deposit(74.35);
        bal1.withdraw(20.00);
        System.out.println("After transactions, ");
        bal1.display();
    }
}
