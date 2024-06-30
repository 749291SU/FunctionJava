package func.stream;

import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @projectName: FunctionJava
 * @package: func.stream
 * @className: CollectorTest
 * @author: 749291
 * @description: TODO
 * @date: 6/30/2024 9:05 PM
 * @version: 1.0
 */

public class CollectorTest {
    public static void main(String[] args) {
        // fruits
//        Stream.of(
//                new Fruit("apple", 10, 20),
//                new Fruit("banana", 20, 30),
//                new Fruit("orange", 30, 40)
//        ).collect(Collectors.toList()).forEach(fruit -> System.out.println(fruit.getName()));


//        String result = Stream.of(
//                new Fruit("apple", 10, 20),
//                new Fruit("banana", 20, 30),
//                new Fruit("orange", 30, 40)
//        ).map(Fruit::getName).collect(Collectors.joining("-"));
//        System.out.println(result);


//        String result = Stream.of(
//                new Fruit("apple", 10, 20),
//                new Fruit("banana", 20, 30),
//                new Fruit("orange", 30, 40)
//        ).collect(Collectors.toMap(Fruit::getName, Fruit::getPrice)).toString();

//        System.out.println(result);


//        String result = Stream.of(
//                new Fruit("apple", 10, 20),
//                new Fruit("banana", 20, 30),
//                new Fruit("orange", 30, 40)
//        ).collect(Collectors.groupingBy(f -> f.getName().length())).toString();
//        System.out.println(result);


        String result = Stream.of(
                new Fruit("apple", 10, 20),
                new Fruit("banana", 20, 30),
                new Fruit("orange", 30, 40)
        ).collect(Collectors.groupingBy(f -> f.getName().length(), Collectors.mapping(Fruit::getName, Collectors.toList()))).toString();


//        String result1 = Stream.of(
//                new Fruit("apple", 10, 20),
//                new Fruit("banana", 20, 30),
//                new Fruit("orange", 30, 40)
//        ).collect(Collectors.groupingBy(f -> f.getName().length(), Collectors.filtering(f -> f.getPrice() <= 20, Collectors.mapping(Fruit::getName, Collectors.toList())))).toString();
//        System.out.println(result1);


//        System.out.println(result);


//        String result1 = Stream.of(
//                new Fruit("apple", 10, 20),
//                new Fruit("banana", 20, 30),
//                new Fruit("orange", 30, 40)
//        ).collect(Collectors.groupingBy(f -> f.getName().length(), Collectors.flatMapping(f -> f.getName().chars().mapToObj(Character::toString), Collectors.joining("-")))).toString();
//        System.out.println(result1);


//        String result1 = Stream.of(
//                new Fruit("apple", 10, 20),
//                new Fruit("banana", 20, 30),
//                new Fruit("orange", 30, 40)
//        ).collect(Collectors.groupingBy(f -> f.getName().length(), Collectors.counting())).toString();
//        System.out.println(result1);
//

        Stream.of(
                new Fruit("apple", 10, 20),
                new Fruit("banana", 20, 30),
                new Fruit("orange", 30, 40)
        ).collect(Collectors.groupingBy(f -> f.getName().length(), Collectors.minBy(Comparator.comparingInt(Fruit::getPrice)))).forEach((k, v) -> System.out.println(k + " " + v.get().getName()));
    }
}
