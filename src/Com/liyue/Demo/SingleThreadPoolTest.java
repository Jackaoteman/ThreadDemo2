package Com.liyue.Demo;

import java.util.concurrent.*;

/***
 *
 */
public class SingleThreadPoolTest {

    public static void main(String[] args) {


        ExecutorService executor = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        /**
         * 定义五个任务
         */
        for (int i = 0; i < 5; i++) {
            Future future = executor.submit(new Demo());
            try {
                if(future.get()==null){
                    System.out.println("任务完成");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }
}
