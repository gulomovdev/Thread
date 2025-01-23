public class Market implements Runnable {
    private boolean open = false;
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10_000; i++) {
            if(open){
                open = true;
                balance++;
            }
        }
    }
}
