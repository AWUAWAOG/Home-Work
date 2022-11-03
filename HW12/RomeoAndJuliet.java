package HW12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class RomeoAndJuliet {
    public static void main(String[] args) throws IOException {
        FileInputStream romeo = new FileInputStream("F://Downloads/romeo-and-juliet.txt");

        int z = -1;
        StringBuilder text = new StringBuilder();

        while ((z = romeo.read()) != -1) {
            text.append((char) z);
        }
        romeo.close();

        String s = text.toString().replace(" ,()?=.][-", " ");

        String[] words = s.split(" ");
        String longest = "";

        for (int i = 0; i < words.length; i++) {
            for (int j = 1 + i; j < words.length; j++) {
                if (words[i].length() > words[j].length()) {
                    longest = words[i];
                }
            }
        }
        System.out.println(longest + " [" + longest.length() + "]");

        FileOutputStream fileOutputStream = new FileOutputStream("F://Downloads/longest");
        byte[] word = longest.getBytes();
        fileOutputStream.write(word);
        fileOutputStream.close();
    }
}