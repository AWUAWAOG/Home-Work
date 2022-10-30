package HW11;

import java.io.IOException;
import java.util.Random;

public class Methods {
    Random random = new Random();

    void first() {
        try {
            int i = 5;
            int j = 0;
            System.out.println(i / j);
        } catch (ArithmeticException exception) {
            System.err.println(exception);
        }
    }

    void second() {
        try {
            int[] array = new int[2];
            array[0] = 5;
            array[1] = 0;
            System.out.println(array[2]);
            System.out.println(array[0] / array[1]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.err.println(exception);
        } catch (ArithmeticException exception) {
            System.err.println(exception);
        }
    }

    void third() {
        try {
            int[] array_2 = new int[-10];
            array_2[0] = 5;
            array_2[1] = 0;
            for (int i = 2; i < array_2.length; i++) {
                array_2[i] = random.nextInt();
            }
            System.out.println(array_2[12]);
            System.out.println(array_2[0] / array_2[1]);
        } catch (NegativeArraySizeException exception) {
            System.err.println(exception);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.err.println(exception);
        } catch (ArithmeticException exception) {
            System.err.println(exception);
        }
    }

    void fourth() {
        try {
        String[] array_3 = new String[-2];
        } catch (NegativeArraySizeException exception){
            System.err.println(exception);
        } finally {
            System.out.println("END");
        }
    }

    void notFinally(){
        try {
            System.out.println(4/0);
        } catch (ArithmeticException exception){
            System.err.println(exception);
        } finally {
            return;
        }
    }
}