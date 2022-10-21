package Interface;

public class Cow extends Animal {

    @Override
    public void eat() {
        super.eat();
        System.out.println("grass");
    }
}
