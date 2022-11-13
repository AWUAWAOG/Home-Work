package Tests;

public class HashMap {
    public static void main(String[] args) {

        java.util.HashMap<Integer,Integer> in = new java.util.HashMap<>();
        in.put(1,9);
        in.put(2,8);
        in.put(3,5);

        System.out.println(in.replace(2,8,6));

        System.out.println(in);
    }
}