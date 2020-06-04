package Com.liyue.lock;

public class MutexTest {



    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {

            Thread thread = new Thread(new NumberAdd());
            thread.start();

        }

    }
}
