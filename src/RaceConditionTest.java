import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RaceConditionTest extends Thread {
    int num  = 0;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10_000; i++) {

            num++;

        }
    }
}
