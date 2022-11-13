package HW14;

import java.util.Scanner;
import java.util.function.Predicate;

public class Lambda_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        Predicate<String> someWord = a -> word.startsWith("");

            if (word.startsWith("J")) {
                System.out.println("da");
            }

            if (word.startsWith("N")) {
                System.out.println("da");
            }

            if (word.endsWith("A")) {
                System.out.println("da");
            }
    }
}