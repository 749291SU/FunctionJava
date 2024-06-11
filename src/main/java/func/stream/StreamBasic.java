package func.stream;

import java.util.ArrayList;
import java.util.function.Function;


/**
 * @projectName: FunctionJava
 * @package: func.stream
 * @className: StreamBasic
 * @author: 749291
 * @description: TODO
 * @date: 5/30/2024 16:33
 * @version: 1.0
 */

public class StreamBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i ++) {
            list.add(i);
        }

        list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

        Function<Integer, Integer> f = i -> i * i;
        list.stream().map(f).forEach(System.out::println);

        System.out.println(f.apply(2));
    }
}
