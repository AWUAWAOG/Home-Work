package HW33;

import java.util.Objects;

public class User implements Cloneable {
    private int userId;
    private Double userMoney;

    public User(int userId, double userMoney) {
        this.userId = userId;
        this.userMoney = userMoney;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(double userName) {
        this.userMoney = userName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userMoney);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userMoney=" + userMoney +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof User)) return false;
        User user = (User) obj;
        return userId == user.userId && Double.compare(user.userMoney, userMoney) == 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
