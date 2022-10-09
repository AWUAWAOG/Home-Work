package Arrays;

import javax.swing.*;
import java.util.Arrays;

public class ArraysTask5_6 {
    public static void main(String[] args) {

        int[] array_2 = {1, 2, 3, 7, 5};
        for (int i = array_2.length - 1; i >= 0; i--) {
            System.out.print(array_2[i]);
        }
        System.out.println();
        for (int i = 0; i < array_2.length; i++) {
        }
        System.out.println(Arrays.toString(array_2));

        boolean order = true;
        for (int i = 1; i < array_2.length; i++) {
            if (array_2[i] <= array_2[i - 1]) {
                order = false;
                break;
            }
        }
        if (order) {
            System.out.println("Increasing order");
        } else System.out.println("NOT Increasing order");

    }
}



