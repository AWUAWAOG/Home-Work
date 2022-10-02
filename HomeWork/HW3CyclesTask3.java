package HomeWork;

import java.util.Scanner;

public class HW3CyclesTask3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x;
        int y;
        x = scanner.nextInt();
        y = x * (x + 1) % 2;
        System.out.println(y);
        
    }
}
