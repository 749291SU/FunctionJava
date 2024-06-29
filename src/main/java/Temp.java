import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;

/**
 * @projectName: FunctionJava
 * @package: PACKAGE_NAME
 * @className: Temp
 * @author: 749291
 * @description: TODO
 * @date: 6/21/2024 2:48 PM
 * @version: 1.0
 */

public class Temp {
    public static void main(String[] args) throws FileNotFoundException {
//        Long a = 1L;

//        B b = new B();
        Integer i1 = 10;
        Integer i2 = 10;
//        System.out.println(i1);
//        System.out.println(i2);
//        System.out.println(i1 == i2);
//        System.out.println(test());
//        System.out.println(test1());

        FileInputStream fileInputStream = new FileInputStream("a.txt");
    }

    static int test() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            System.out.println(3);
        }
    }

    static int test1() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
}

class A {
    private int a;

    public int getA() {
        return a;

    }
}

class B extends A {

}


final class D {
    private final int dd;


    public D() {
        dd = 2;
    }
}

