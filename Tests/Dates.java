package Tests;

import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {

        LocalDate day = LocalDate.now();
        String aDay = day.getDayOfWeek().toString();

        switch (aDay) {
            case "MONDAY":
                System.out.println("MONDAY");
            case "TUESDAY":
                System.out.println("TUESDAY");
            case "WEDNESDAY":
                System.out.println("WEDNESDAY");
            case "THURSDAY":
                System.out.println("THURSDAY");
            case "FRIDAY":
                System.out.println("FRIDAY");
            case "SATURDAY":
                System.out.println("SATURDAY");
            case "SUNDAY":
                System.out.println("SUNDAY");
        }
    }
}