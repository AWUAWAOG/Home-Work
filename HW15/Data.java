package HW15;

import java.util.*;

public class Data {
    public static void main(String[] args) {
        HashMap<Integer, String> data = new HashMap<>();

        data.put(1, "Alex");                 //some data set
        data.put(2, "Bob");
        data.put(3, "CJ");
        data.put(4, "Deny");
        data.put(5, "Eternal");
        data.put(6, "Flint");
        data.put(7, "George");
        data.put(8, "Home");
        data.put(9, "Identity");
        data.put(10, "James");
        data.put(11, "Key");
        data.put(12, "Loot");
        data.put(13, "Mom");
        System.out.println(data + "\n");

        Set<Integer> keys = data.keySet();
        ArrayList<String> names = new ArrayList<>(data.values());

        if (keys.contains(1 | 2 | 5)) {                           //in range 1/2/5/8/9/13
            if (keys.contains(8 | 9 | 13)) {
                System.out.println(data.get(1));
                System.out.println(data.get(2));
                System.out.println(data.get(5));
                System.out.println(data.get(8));
                System.out.println(data.get(9));
                System.out.println(data.get(13) + "\n");
            }
        }

        String[] array;                                      //values with odd amount of chars
        array = names.toArray(new String[0]);
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() % 2 != 0) {
                System.out.println(array[i]);
            }
        }
        System.out.println();

        StringBuilder reverse = new StringBuilder(names.toString()).reverse();               //reverse
        List<String> someList = List.of(reverse.toString());
        System.out.println(someList);
    }
}