package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description
 * @Author allen
 * @Date 2020/8/6 10:13
 * @ClassName ThreadTest
 **/
public class ThreadTest {

    /**
     * 获取最大sku数量
     */
    private static final Integer LIMIT_SIZE = 1000;

    /**
     * 最大执行sku数量
     */
    private static final Integer EXCUTE_SIZE = 100;

    /**
     * 最大线程数量
     */
    private static ExecutorService executorService = Executors.newFixedThreadPool(ThreadTest.LIMIT_SIZE / ThreadTest.EXCUTE_SIZE);


    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "ab";

        System.out.println(a + b == c);
    }


     static class Task1 implements Runnable {

        private String tianmaSkuMiddleDos;

        public Task1(String tianmaSkuMiddleDos) {
            this.tianmaSkuMiddleDos = tianmaSkuMiddleDos;
        }

        @Override
        public void run() {
            String tianmaSkuMiddleDos = this.tianmaSkuMiddleDos;

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sout(tianmaSkuMiddleDos);

        }
    }

    private static void sout(String tianmaSkuMiddleDos) {
        System.out.println(Thread.currentThread().getName() + ": " + tianmaSkuMiddleDos);
    }
}
