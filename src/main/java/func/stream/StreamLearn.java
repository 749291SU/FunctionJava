package func.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @projectName: FunctionJava
 * @package: func.stream
 * @className: StreamLearn
 * @author: 749291
 * @description: TODO
 * @date: 6/29/2024 9:06 PM
 * @version: 1.0
 */

public class StreamLearn {
    public static void main(String[] args) {
        // fruits
//        Stream.of(
//                List.of(new Fruit("apple", 10, 20), new Fruit("banana", 20, 30)),
//                List.of(new Fruit("orange", 30, 40), new Fruit("peach", 40, 50))
//        ).flatMap(List::stream).forEach(fruit -> System.out.println(fruit.getName()));

//        Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5);
//        Stream<Integer> s2 = Stream.of(6, 7, 8);

//        Stream.concat(s1, s2).forEach(System.out::println);

//        s1.skip(2).forEach(System.out::println);
//        s1.takeWhile(e -> (e & 1) == 1).forEach(System.out::println);
//        s1.dropWhile(e -> (e & 1) == 1).forEach(System.out::println);

//        s1.limit(3).forEach(System.out::println);


//        IntStream.range(1, 10).forEach(System.out::println);
//        IntStream.generate(() -> 1).limit(10).forEach(System.out::println);

//        IntStream.iterate(1, i -> i * 2).limit(10).forEach(System.out::println);

//        IntStream.generate(() -> ThreadLocalRandom.current().nextInt(100)).limit(10).forEach(System.out::println);

//        IntStream.range(1, 11).forEachOrdered(System.out::println);
//        IntStream.iterate(10, x -> x - 1).limit(10).forEachOrdered(System.out::println);
//        IntStream.generate(() -> ThreadLocalRandom.current().nextInt(100)).limit(10).forEachOrdered(System.out::println);

//        boolean b = IntStream.range(1, 11).allMatch(x -> x <= 9);
//        System.out.println(b);

//        Integer integer = Stream.of(1, 3, 5).filter(x -> x % 2 == 0).findAny().orElse(1);
////        System.out.println(first.get());
//        System.out.println(integer);


//        Stream.of(1, 2, 3, 4, 5, 1, 5).distinct().forEach(System.out::println);


//        Stream.of(
//                new Fruit("apple", 10, 20),
//                new Fruit("banana", 20, 30),
//                new Fruit("orange", 30, 40)
//        ).sorted(Comparator.comparingInt(Fruit::getPrice).reversed()).forEach(fruit -> System.out.println(fruit.getName()));

//        Stream.of(3, 4, 1, 2, 5, 99, 1).reduce(Integer::sum).ifPresent(System.out::println);
//        Integer reduce = Stream.of(3, 4, 1, 2, 5, 99, 1).reduce(0, Math::max);
//        System.out.println(reduce);

//        Stream.of(3, 4, 1, 2, 5, 99, 1).reduce(1, Math::min);

//        int[] collect = Stream.of(1, 2, 3, 4, 5).collect(() -> new int[1], (a, b) -> a[0] += b, (a, b) -> {
//        });
//        System.out.println(collect[0]);
    }
}


class Fruit {
    private String name;
    private int price;
    private int quantity;

    public Fruit(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}