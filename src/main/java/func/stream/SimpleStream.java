package func.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
        Integer reduce = SimpleStream.of(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
                .reduce(0, Integer::max);
        System.out.println(reduce);
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
    private Collection<T> collection;
    public SimpleStream(Collection<T> collection) {
        this.collection = collection;
    }
}
