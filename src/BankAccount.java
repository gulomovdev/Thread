public class BankAccount {
    private int balance = 1000;

    public synchronized void deposit(int amount){
        balance+=amount;
        System.out.println(Thread.currentThread().getName()+" deposit: "+amount+", Balance: "+balance);
    }

    public void withdraw(int amount){
        synchronized (this){
            if(balance>=amount){
                balance-=amount;
                System.out.println(Thread.currentThread().getName()+" withdrew: " + amount + ", Balance: " + balance);
            }else{
                System.out.println(Thread.currentThread().getName() + " tried to withdraw: " + amount + ", Insufficient funds!");
            }
        }
    }
}
