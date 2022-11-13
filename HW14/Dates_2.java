package HW14;

import java.time.LocalDate;

public class Dates_2 {
    public static void main(String[] args) {
        LocalDate tuesday = LocalDate.now().plusDays(2);
        System.out.println(tuesday);
    }
}