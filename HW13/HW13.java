package HW13;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.LinkedList;

public class HW13 {
    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<>();
        animals.add("cow");
        animals.add("sheep");
        animals.add("cat");
        animals.add("snake");
        animals.add("dog");

        animals.addLast("parrot");
        animals.removeFirst();

        System.out.println(animals);
    }
}
