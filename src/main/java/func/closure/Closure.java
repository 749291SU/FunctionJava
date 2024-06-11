package func.closure;

/**
 * @projectName: FunctionJava
 * @package: func
 * @className: Closure
 * @author: 749291
 * @description: TODO
 * @date: 5/31/2024 15:53
 * @version: 1.0
 */

public class Closure {
    public static void main(String[] args) {
        Thread t1 = new Thread(new AlternatePrint(), "Thread-1");
        Thread t2 = new Thread(new AlternatePrint(), "Thread-2");
        t1.start();
        t2.start();
    }
}

class AlternatePrint implements Runnable {
    private static Object LOCK = new Object();
    private static int number = 1;

    @Override
    public void run() {
        synchronized (LOCK) {
            while (number < 10) {
                System.out.println(Thread.currentThread().getName() + " " + number++);
                LOCK.notify();
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}