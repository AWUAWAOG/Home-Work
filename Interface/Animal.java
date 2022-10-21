package Interface;

public class Animal implements Eat {

    @Override
    public void eat() {
        System.out.print("I eat ");
    }
}