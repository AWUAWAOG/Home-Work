package Arrays;

import java.util.Random;
import java.util.Scanner;

public class ArraysTask1_2_3_4 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int Index = 0;
        double[] array = new double[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0,9);
            System.out.println(array[i]);
        }
        System.out.println();
        System.out.println("Direct order: ");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        System.out.println("Reverse order: ");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(+array[i]);
        }
        System.out.println();

        double MaxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > MaxValue) {
                MaxValue = array[i];
                Index = i;
            }
        }
        System.out.println("Max value: " + MaxValue);
        System.out.println("Index with Max value: " + Index);
        System.out.println();
        double MinValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= MinValue) {
                MinValue = array[i];
                Index = i;
            }
        }
        System.out.println("Min value: " + MinValue);
        System.out.println("Index with Min value: " + Index);
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i]==0) {
                System.out.println("Zero element: " + array[i]);
            } else System.out.println("Not zero element: " + array[i]);
        }
        System.out.println();

    }
}