package func.stream;

import java.sql.Array;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.*;

/**
 * @projectName: FunctionJava
 * @package: func.stream
 * @className: SimpleStream
 * @author: 749291
 * @description: TODO
 * @date: 6/11/2024 4:37 PM
 * @version: 1.0
 */

public class SimpleStream<T> {
    public static void main(String[] args) {
//        Integer reduce = SimpleStream.of(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
//                .reduce(0, Integer::max);
//        System.out.println(reduce);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.add(9);
        list.add(2);
        list.add(3);

//        HashSet result = SimpleStream.of(list).collect(HashSet::new, HashSet::add);
//
//        result.forEach(System.out::println);
//
//        ArrayList<String> list1 = new ArrayList<>();
//        list1.add("hello"); list1.add(" world!");
//
//        StringBuilder result1 = SimpleStream.of(list1).collect(StringBuilder::new, StringBuilder::append);
//
//        System.out.println(result1);
//
//        StringJoiner result2 = SimpleStream.of(list1).collect(() -> new StringJoiner("-"), StringJoiner::add);
//        System.out.println(result2);

//        HashMap<Integer, Integer> result3 = SimpleStream.of(list).collect(HashMap<Integer, Integer>::new, (a, b) -> {
//            a.put(b, a.containsKey(b) ? a.get(b) + 1 : 1);
//        });
//
//        result3.forEach((a, b) -> {
//            System.out.println(a + ": " + b);
//        });

        HashMap<Integer, AtomicInteger> result3 = SimpleStream.of(list).collect(HashMap<Integer, AtomicInteger>::new, (map, t) -> {
            map.computeIfAbsent(t, k -> new AtomicInteger()).getAndIncrement();
        });

        result3.forEach((a, b) -> {
            System.out.println(a + ": " + b);
        });
    }

    public static <T> SimpleStream<T> of(Collection<T> collection) {
        return new SimpleStream<>(collection);
    }

    public SimpleStream<T> filter(Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        collection.forEach(t -> {
            if (predicate.test(t)) result.add(t);
        });
        return new SimpleStream<>(result);
    }

    public <U> SimpleStream<U> map(Function<T, U> function) {
        List<U> result = new ArrayList<>();
        collection.forEach(t -> {
            result.add(function.apply(t));
        });
        return new SimpleStream<>(result);
    }

    public void forEach(Consumer<T> consumer) {
        collection.forEach(t -> consumer.accept(t));
    }

    public T reduce(T ini, BinaryOperator<T> binaryOperator) {
        AtomicReference<T> result = new AtomicReference<>(ini);
        collection.forEach(t -> {
            result.set(binaryOperator.apply(result.get(), t));
        });
        return result.get();
    }

    public <C> C collect(Supplier<C> supplier, BiConsumer<C, T> biConsumer) {
        C c = supplier.get();

        collection.forEach(e -> {
            biConsumer.accept(c, e);
        });

        return c;
    }

    private Collection<T> collection;

    public SimpleStream(Collection<T> collection) {
        this.collection = collection;
    }
}
