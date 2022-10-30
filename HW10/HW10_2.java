package HW10;

import java.util.Scanner;

public class HW10_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[3];

        for (int i = 0; i < 3; i++) {
            array[i] = scanner.nextLine();
        }
        for (int i = array.length - 1; i > 0; i--) {
            for (int x = 0; x < i; x++) {
                if (array[x].length()>array[x+1].length()){
                    String line = array[x];
                    array[x] = array[x+1];
                    array[x+1] = line;
                    }
                }
            }
        for (int i = 0; i <array.length;i++){
            System.out.println(array[i]);
        }
    }
}