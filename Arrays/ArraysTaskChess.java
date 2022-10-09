package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTaskChess {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] array_3 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}};
        for (int i = 0; i < array_3.length; i++) {
            for (int x = 0; x < array_3[i].length; x++) {
                array_3[i][x] += scanner.nextInt();
                System.out.println(array_3[i][x]);
            }
        }
    }
}
