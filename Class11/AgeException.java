package Class11;

public class AgeException extends Exception {

    int age;

    public AgeException(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Your age: " + age + ". Must be MORE than 18.";
    }
}