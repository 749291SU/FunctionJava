package func.stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @projectName: FunctionJava
 * @package: func.stream
 * @className: ParallelStreamTest
 * @author: 749291
 * @description: TODO
 * @date: 6/30/2024 10:05 PM
 * @version: 1.0
 */

public class ParallelStreamTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        IntStream.range(1, 10000000).boxed().collect(Collectors.toList());
        long end = System.currentTimeMillis();
        System.out.println("serial: " + (end - start));

        start = System.currentTimeMillis();
        IntStream.range(1, 10000000).boxed().parallel().collect(Collectors.toList());
        end = System.currentTimeMillis();
        System.out.println("parallel: " + (end - start));
    }
}
