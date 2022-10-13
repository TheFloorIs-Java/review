package threading;

public class RunnableThread implements Runnable{
    String name;
    /*
    magically represent the amount of time needed for security checks before a bank transaction
     */
    double waitMillis;
    BankAccount account;
    double amount;

    public RunnableThread (String name, double waitMillis, BankAccount account, double amt){
        this.name = name;
        this.waitMillis = waitMillis;
        this.account = account;
        amount = amt;
    }
    @Override
    public void run() {

        try {
            Thread.sleep((long) waitMillis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        double oldBalance = account.getBalance();
        System.out.println("Thread "+name+ " read balance as "+ oldBalance);
        double newBalance = oldBalance + amount;
        account.setBalance(newBalance);
        System.out.println("Thread "+ name+ " updated balance to "+account.getBalance());
    }
}