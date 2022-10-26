package Class11;

public class Class11 {
    public static void main(String[] args) throws Exception {

        try {
            int array[] = new int[5];
            array[7] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR");
        } finally {
            System.out.println("End");
        }

        Person person = new Person(15);

    }
}