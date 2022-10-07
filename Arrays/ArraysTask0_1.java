package Arrays;

import java.util.Scanner;

public class ArraysTask0_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] array = new double[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random()*10;
            System.out.println(array[i]);
        }
        System.out.println();
        for (int i = 0; i < array.length;i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        for (int i = array.length-1; i<=0;i--) {
            System.out.println(array[i]);
        }
    }
}
