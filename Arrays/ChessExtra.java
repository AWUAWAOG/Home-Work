package Arrays;

import java.util.Arrays;

public class ChessExtra {
    public static void main(String[] args) {

        String[][] Chess = new String[8][8];
        Chess[0][0] = "W";
        Chess[0][7] = "B";
        for (int i = 0; i < Chess.length; i++) {
            for (int x = 0; x < Chess[i].length; x++) {
                if (i == x) {
                    Chess[i][x] = "W";
                    System.out.println(Chess[i][x]);
                }
            }
        }
        for (int i = 0; i < Chess.length; i++) {
            for (int x = 0; x < Chess[i].length; x++) {
                if (i + x == (Chess.length - 1)) {
                    Chess[i][x] = "B";
                    System.out.println(Chess[i][x]);
                }
            }
        }
        for (int i = 0; i < Chess.length; i++) {
            for (int x = 0; x < Chess[i].length; x++) {
                System.out.println(Arrays.toString(Chess));
            }
        }
    }
}