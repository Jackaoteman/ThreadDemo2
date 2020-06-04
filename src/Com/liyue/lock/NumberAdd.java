package Com.liyue.lock;

import java.util.concurrent.atomic.AtomicInteger;

public class NumberAdd implements Runnable {


    private volatile int code=100;

    @Override
    public  void run() {

//        Mutex mutex=new Mutex();
//        mutex.lock();
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+"计算结果是="+code--);
            }
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            //mutex.unlock();
        }


    }
}
