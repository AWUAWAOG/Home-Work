package HW33;

public class HW33 {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User(123456789, 35900.00);
        User userClone = (User) user.clone();

        userClone.setUserMoney(0.00);

        System.out.println(user.hashCode() + " | " + user);
        System.out.println(userClone.hashCode() + " | " + userClone);
        System.out.println(user.equals(userClone));
    }
}
