package Class11;

public class Person {
    private int age;

    public Person(int age) throws AgeException {
        if (age >= 18) {
            this.age = age;
        } else throw new AgeException(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }
}