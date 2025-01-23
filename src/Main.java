public class Main {
    public static void main(String[] args)  {


         /*  Counter runnable = new Counter();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        Thread thread4 = new Thread(runnable);
        thread1.setName("Thread_1");
        thread1.setName("Thread_2");
        thread1.setName("Thread_3");
        thread1.setName("Thread_4");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(thread1.getState());
        System.out.println(thread2.getState());
        System.out.println(thread3.getState());
        System.out.println(thread4.getState());
        System.out.println(runnable.getSum());
        RaceConditionTest test = new RaceConditionTest();

     Thread test1 = new Thread(test);
        Thread test2 = new Thread(test);
        Thread test3 = new Thread(test);


        test1.start();
        test2.start();
        test3.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(test.getNum());

        LockExample lockExample = new LockExample();
        Thread thread1 = new Thread(lockExample);
        Thread thread2 = new Thread(lockExample);
        Thread thread3 = new Thread(lockExample);
        Thread thread4 = new Thread(lockExample);


        thread2.start();
        thread3.start();
        thread1.start();
        thread4.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(lockExample.getN());


        Market market = new Market();
        Thread thread1 = new Thread(market);
        Thread thread2 = new Thread(market);
        Thread thread3 = new Thread(market);
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(market.getBalance());*/
        Counter counter = new Counter();
        Thread thread1 =new Thread(counter);
        Thread thread2 =new Thread(counter);
        Thread thread3 =new Thread(counter);
        Thread thread4 =new Thread(counter);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter.getSum());
    }
}