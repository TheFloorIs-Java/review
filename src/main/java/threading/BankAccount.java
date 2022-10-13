package threading;

public class BankAccount {
    public double balance;
    public BankAccount(double balance){this.balance = balance;}
    public synchronized void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
}
