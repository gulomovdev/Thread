import java.util.Objects;

public class Counter implements Runnable {
    private  Integer sum = 0;

    public final Object lock  = new Object();

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
/*
 public synchronized void counter (){
        setSum(getSum()+1);
 }
*/
    @Override
    public void run() {
        for (int i = 0; i < 10_000; i++) {
            synchronized (lock){
                sum++;
            }
        }

    }
}
