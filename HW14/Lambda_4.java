package HW14;

import java.util.function.Supplier;

public class Lambda_4 {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> {
            System.out.println((int)(Math.random()*10));
            return null;
        };
        supplier.get();
    }
}
