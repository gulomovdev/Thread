import java.util.concurrent.locks.ReentrantLock;

public class LockExample implements Runnable {
    ReentrantLock lock = new ReentrantLock();
    private int n = 0;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void counter(){
        setN(getN()+1);
    }


    @Override
    public void run() {
        for (int i = 0; i <10_000 ; i++) {
            lock.lock();
            counter();
            lock.unlock();
        }
    }
}
