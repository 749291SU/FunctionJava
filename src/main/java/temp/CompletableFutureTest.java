package temp;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @projectName: FunctionJava
 * @package: temp
 * @className: CompletableFutureTest
 * @author: 749291
 * @description: TODO
 * @date: 6/27/2024 4:16 PM
 * @version: 1.0
 */

public class CompletableFutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> task1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 1;
        });

        CompletableFuture<Integer> task2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 1;
        });

        // 计算耗时
        long start = System.currentTimeMillis();
        CompletableFuture<Integer> result = task1.thenCombine(task2, Integer::sum);


        Integer integer = result.get();
        System.out.println(integer);
        long end = System.currentTimeMillis();

        System.out.println("耗时: " + (end - start));
    }
}
