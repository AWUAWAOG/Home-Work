package HW10;

import java.util.Scanner;

public class HW10_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line1;
        String line2;
        String line3;

        line1 = scanner.next();
        line2 = scanner.next();
        line3 = scanner.next();

        if (line1.length() < line2.length()) {
            if (line1.length() < line3.length()) {
                System.out.println("the shortest string is: " + line1);
            }
        }
        if (line2.length() < line1.length()) {
            if (line2.length() < line3.length()) {
                System.out.println("the shortest string is: " + line2);
            }
        }
        if (line3.length() < line1.length()) {
            if (line3.length() < line2.length()) {
                System.out.println("the shortest string is: " + line3);
            }
        }
        if (line1.length() > line2.length()) {
            if (line1.length() > line3.length()) {
                System.out.println("the longest string is: " + line1);
            }
        }
        if (line2.length() > line1.length()) {
            if (line2.length() > line3.length()) {
                System.out.println("the longest string is: " + line2);
            }
        }
        if (line3.length() > line1.length()) {
            if (line3.length() > line2.length()) {
                System.out.println("the longest string is: " + line3);
            }
        }
    }
}