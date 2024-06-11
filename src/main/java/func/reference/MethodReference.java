package func.reference;


/**
 * @projectName: FunctionJava
 * @package: func.reference
 * @className: MethodReference
 * @author: 749291
 * @description: TODO
 * @date: 5/30/2024 16:55
 * @version: 1.0
 */

public class MethodReference {
    public static void main(String[] args) {
        F1 f1 = (a) -> (b) -> a + b;
        System.out.println(f1.op(1).op(2));
    }
}
@FunctionalInterface
interface F1 {
    F2 op (int a);
}

@FunctionalInterface
interface F2 {
    int op(int b);
}
