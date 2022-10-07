package Arrays;

import java.util.Arrays;

public class ArraysTask5_6 {
    public static void main(String[] args) {

        int[] array_2 = {4, 99, 2, 0, 8, 9, 18, 21, 39};

        for (int i = array_2.length - 1; i >= 0; i--) {
            System.out.println(array_2[i]);
        }
        System.out.println();

        int nextValue = array_2[0];
        int NewValue = array_2[1];
        for (int i = 0; i < array_2.length; i++) {
            if (array_2[i] > nextValue) {
                System.out.println(array_2[i] + " true");
            }
        }
    }
}


