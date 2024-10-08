package assignment_day5;

import java.util.Scanner;

public class account_details {
    private int id;
    private String name;
    private double balance;

    public account_details(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;

    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public boolean withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
            return true;
        }
        else return false;
    }
    public void getdetails(){
        System.out.println("ID: " + id + "\nAccount_type: " + name + "\nBalance: " + balance );
    }
    public static void main(String[] args) {
        System.out.println("Enter account details:");
        System.out.println("Enter id: ");
        Scanner a=new Scanner(System.in);
        int id = a.nextInt();
        System.out.println("Enter Account type: ");
        a =  new Scanner(System.in);
        String name = a.next();
        System.out.println("Enter balance: ");
        a= new Scanner(System.in);
        double balance = a.nextDouble();
        System.out.println("Enter amount to withdraw: ");
        a= new Scanner(System.in);
        double amount = a.nextDouble();
        a.close();
        account_details s = new account_details(id,name,balance);
        s.getdetails();
        if(s.withdraw(amount)) System.out.println("New balance: " + s.getBalance());
        else System.out.println("Insufficient balance");
    }
}
