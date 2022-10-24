package Class10;

public class Class10 {
    public static void main(String[] args) {

        System.out.println("Hello" + " World");
        System.out.println("Hello".concat(" World"));

        System.out.println("Hello".equals("hello"));
        System.out.println("Hello".equalsIgnoreCase("hello"));

        System.out.println("Hello".substring(3));

        System.out.println("Hello".length());

        System.out.println("Hello".indexOf("e"));

        boolean x = true;
        String y = String.valueOf(x);
        System.out.println(y);

        System.out.println("hello".toUpperCase());

        System.out.println("12345".replace("1","%"));

        System.out.println("    Hello!        ".trim());

        System.out.println("    Hi ".isBlank());

        String line = "My/Name/is/Andrey";
        String lines [] = line.split("/");
        for (String a : lines){
            System.out.println(a);
        }
        System.out.println();

        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append("xxxx");
        stringBuilder.insert(5,"y");
        stringBuilder.delete(3,6);
        stringBuilder.reverse();
        stringBuilder.toString();
        System.out.println(stringBuilder);
    }
}
