package func.interf;

import java.nio.file.DirectoryStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @projectName: FunctionJava
 * @package: func.interf
 * @className: FunctionInterface
 * @author: 749291
 * @description: TODO
 * @date: 5/31/2024 14:25
 * @version: 1.0
 */

public class FunctionInterface {
    public static void main(String[] args) {
//        Type<String> getS = () -> new String("hello");

//        IntPredicate intPredicate = (a) -> (a & 1) == 0;

//        System.out.println(intPredicate.test(1));

//        UnaryOperator<List<Integer>> unaryOperator = list -> list.stream().filter(t -> t % 2 == 0).collect(Collectors.toList());
//        BiFunction<List<Integer>, Predicate<Integer>, List<Integer>> binaryOperator = (list, pred) -> list.stream().filter(pred).collect(Collectors.toList());


//        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).collect(Collectors.toList()).forEach(System.out::println);

//        Stream.of(
//                new Student("A", 10),
//                new Student("B", 20),
//                new Student("C", 30),
//                new Student("D", 40)
//        ).map(Student::getName).collect(Collectors.toList()).forEach(System.out::println);
//        Function<String, Integer> stif = Integer::parseInt;
//        BiPredicate<List<String>, String> spre = List::contains;

        Student student = new Student("A", 19);

        Predicate<Student> ageGreaterThan = student::ageGreaterThan;
    }
}

@FunctionalInterface
interface Type<T> {
    T op();
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
//
//    public static boolean ageGreaterThan(Student student) {
//        return student.age > 18;
//    }

    public boolean ageGreaterThan(Student student) {
        return student.age > 18;
    }
}