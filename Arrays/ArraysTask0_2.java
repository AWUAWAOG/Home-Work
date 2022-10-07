package Arrays;

import java.util.Scanner;

public class ArraysTask0_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] array = new double[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            System.out.println(array[i]);
        }

    }
}
