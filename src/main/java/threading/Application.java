package threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {

    public static void main(String[] args) throws InterruptedException {
//        int y = 0 =2;
//        int z = 2+3+4+5;
//        autoboxing and autounboxing
        Integer x = 5;
        int y = x;
        Integer z = y;
        /*

        We could make a class that extends Thread to make a class that represents a thread.
        This isn't really used though because we have better tools.
         */
        BankAccount tedsAccount = new BankAccount(500);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        RunnableThread thread1 = new RunnableThread("alpha", 700, tedsAccount, 100.0);
        RunnableThread thread2 = new RunnableThread("bravo", 500, tedsAccount, 50.0);
        executor.submit(thread1);
        executor.submit(thread2);
        System.out.println("Hello from main!");
        Thread.sleep(1000);
        /*
        unpredictable behavior that is caused by multiple threads trying to enact changes simultaneously is a race
        condition
         */
        System.out.println("Final bank balance : " +tedsAccount.getBalance());
    }
    public static void autoBox(Integer x){

    }
    public void overloaded(){

    }
    public void overloaded(int x){

    }
    public void overloaded(String x){

    }
}
