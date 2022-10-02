package HomeWork;

import java.util.Scanner;

public class HW3CyclesTask3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x;
        int y;
        x = scanner.nextInt();
        do {
            y = x * (x + 1) % 2;
        } while (x<0);
        System.out.println(y);

    }
}
