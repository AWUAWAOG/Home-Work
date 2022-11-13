package HW14;

import java.util.function.Function;

public class Lambda_2 {
    public static void main(String[] args) {
        Box box = new Box(7500);

        Function<String, Object> newBox = a -> {
            return "Shipped the box with " + box.getN() + " kg";
        };
        Object result = newBox.apply("");
        System.out.println(result);
    }
}
