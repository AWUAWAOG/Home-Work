package HW14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Dates_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate day = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(day.getDayOfWeek());
    }
}