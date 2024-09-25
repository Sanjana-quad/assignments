public class account {
    private int accno;
    private String name;
    private double balance;
    public account(int accno, String name, double balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if(amount>0) balance = balance + amount;
        else System.out.println("Insufficient Amount");
    }
    public void withdraw(double amount) {
        if(amount>0 && amount<= balance) balance = balance - amount;
        else if(amount<0) System.out.println("Insufficient Amount");
        else System.out.println("Insufficient Balance");
    }
    public void checkbalance() {
        if(balance<0) System.out.println("Insufficient Balance");
        else System.out.println("Balance: " + balance);
    }
    public void accdetails() {
        System.out.println("Accno: " + accno);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}
class main{
    public static void main(String[] args) {
        account a = new account(1, "Alex", 500);
        a.deposit(20);
        a.withdraw(30);
        a.accdetails();
        a.checkbalance();
    }
}