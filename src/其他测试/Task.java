import java.util.concurrent.*;

/**
 * Created by yans67 on 2018/6/7.
 * 测试是否会 CallerRunsPolicy
 */
public class Task implements Runnable {

    @Override
    public void run() {
        System.out.println(System.currentTimeMillis()
                + " :Thread ID:" + Thread.currentThread().getId()
                + " :name" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {


        Thread.currentThread().setName("abc");
        ExecutorService es = new ThreadPoolExecutor(5,
                5,
                0,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(10),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());

        Task task = new Task();

        for (int i = 0; i < 30; i++) {

            es.execute(task);
//            es.submit(task);
            Thread.sleep(10);
        }

        System.out.println("Hello World!");

    }
}